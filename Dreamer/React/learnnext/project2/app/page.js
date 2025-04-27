"use client";
import React, { useState, useEffect } from "react";
import supabase from "./Lib/Supabasee.js";

export default function Home() {
  const [studentprofile, setstudentprofile] = useState([]);

  useEffect(() => {
    LoadStudentList();
  }, []);

  async function LoadStudentList() {
    try {
      const { data, error } = await supabase.from("Student").select();
      if (error) {
        console.error("Error fetching student data:", error.message);
        alert("Failed to load student data. Please try again.");
        return;
      }
      setstudentprofile(data || []);
    } catch (err) {
      console.error("Unexpected error:", err);
      alert("An unexpected error occurred. Please try again.");
    }
  }

  return (
    <div>
      <div>
        {studentprofile.map((stud, index) => (
          <div key={index}>
            <h1>{stud.name}</h1>
          </div>
        ))}
      </div>
    </div>
  );
}
