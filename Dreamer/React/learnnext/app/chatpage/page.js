//CHATAPP WEBSITE
"use client";
import React, { useState } from "react";
import {
  PencilIcon,
  FileIcon,
  ShareIcon,
  AlarmCheck,
  PlusIcon,
  MessageSquareIcon,
} from "lucide-react";

export default function ChatPage() {
  const [conversations, setConversations] = useState([]);
  const [activeConvo, setActiveConvo] = useState({});
  const [userQue, setUserQue] = useState("");

  async function getAIResponse() {
    const GEMINI_API_URL =
      "https://generativelanguage.googleapis.com/v1beta/models";
    const MODEL_NAME = "gemini-2.0-flash";
    const apiKey = "AIzaSyANuxNeSC9wRCsbvkjemYtRHSDY9Pn6Ou0";

    const response = await fetch(
      `${GEMINI_API_URL}/${MODEL_NAME}:generateContent?key=${apiKey}`,
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          contents: [
            {
              parts: [
                {
                  text: `behen mera hairfall ho raha hai kya karu batha
                   
                  `,
                },
              ],
            },
          ],
        }),
      }
    );
    const data = await response.json();
    let content = data.candidates[0]?.content?.parts[0]?.text || "";
    content = content.replace("```", "");

    setActiveConvo((prev) => ({
      ...prev,
      messages: [
        ...(prev.messages || []),
        {
          role: "assistant",
          content: content,
        },
      ],
    }));
  }

  return (
    <div className="flex flex-row min-h-screen p-2">
      {/* Sidebar */}
      <div className="flex flex-col w-[200px]">
        <button
          className="flex flex-row text-white items-center justify-center bg-black p-2 rounded-md shadow"
          onClick={() => {
            setConversations([
              ...conversations,
              {
                title: "Conversation",
                messages: [],
              },
            ]);
          }}
        >
          <PlusIcon />
          <div>New Chat</div>
        </button>

        <hr />
        {conversations.map((convo, index) => (
          <div
            key={index}
            onClick={() => setActiveConvo(convo)}
            className="flex flex-row bg-gray-200 m-2 shadow cursor-pointer"
          >
            <MessageSquareIcon width={30} />
            <div>{convo.title}</div>
          </div>
        ))}
      </div>

      {/* Main Content */}
      <div className="w-full flex flex-col min-h-screen">
        {/* Navbar */}
        <nav className="flex flex-row p-3 font-bold text-[24px] items-center justify-between">
          <div className="flex flex-row">
            <h1 className="mr-2">LanBuddy</h1>
            <PencilIcon className="m-2" />
            <FileIcon className="m-2" />
          </div>
          <div className="flex flex-row">
            <ShareIcon />
            <AlarmCheck />
          </div>
        </nav>

        {/* Messages */}
        <div className="flex flex-col bg-gray-200 text-black p-4">
          {activeConvo?.messages?.length > 0 ? (
            activeConvo.messages.map((message, i) => (
              <div
                key={i}
                className={`flex flex-row ${
                  message.role === "user" ? "justify-end" : "justify-start"
                }`}
              >
                <div className="p-2 bg-white rounded-md shadow m-2">
                  {message.content}
                </div>
              </div>
            ))
          ) : (
            <div className="text-gray-500">No messages yet.</div>
          )}
        </div>

        {/* Input Section */}
        <div className="flex flex-row items-center justify-center p-3">
          <input
            type="text"
            value={userQue}
            onChange={(e) => setUserQue(e.target.value)}
            placeholder="Type a message..."
            className="w-[800px] h-[50px] border-2 rounded-full px-4"
          />
          <button
            className="bg-blue-500 text-white font-bold p-4 rounded-full ml-2"
            onClick={() => {
              setActiveConvo((prev) => ({
                ...prev,
                messages: [
                  ...(prev.messages || []),
                  {
                    role: "user",
                    content: userQue,
                  },
                ],
              }));
              setUserQue(""); // Clear input
              getAIResponse();
            }}
          >
            Send
          </button>
        </div>
      </div>
    </div>
  );
}
