"use client";
import React, { useState } from "react";
import InputField from "../Components/InputField.js";
import supabase from "../Lib/Supabasee.js";

export default function CreateStudent() {
  const [name, setName] = useState("");
  const [age, setAge] = useState("");
  const [address, setAddress] = useState("");
  const [gender, setGender] = useState("");
  const [usn, setUsn] = useState("");
  const [phone, setPhone] = useState("");
  const [email, setEmail] = useState("");
  const [isSubmitting, setIsSubmitting] = useState(false);

  const handleSubmit = async () => {
    if (!usn || !name || !phone || !age || !address) {
      alert("USN, Name, Phone, Age, and Address are required fields.");
      return;
    }

    setIsSubmitting(true);

    try {
      const { data, error } = await supabase.from("Student").insert([
        {
          Name: name,
          Email: email,
          Address: address,
          gender,
          USN: usn,
          phone,
          age: parseInt(age, 10),
        },
      ]);

      if (error) {
        console.error("Error inserting data:", error.message);
        alert("Failed to create student. Please try again.");
      } else {
        alert("Student created successfully!");
        console.log("Inserted data:", data);

        // Reset form fields
        setName("");
        setEmail("");
        setAddress("");
        setGender("");
        setUsn("");
        setPhone("");
        setAge("");
      }
    } catch (err) {
      console.error("Unexpected error:", err);
      alert("An unexpected error occurred. Please try again.");
    } finally {
      setIsSubmitting(false);
    }
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gray-100">
      <div className="flex flex-col p-6 rounded-md shadow-md w-[440px] bg-white">
        <h1 className="text-2xl font-semibold mb-4 text-center text-blue-800">
          Create Student
        </h1>
        <InputField
          type="text"
          placeholder="Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <InputField
          type="email"
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <InputField
          type="text"
          placeholder="Address"
          value={address}
          onChange={(e) => setAddress(e.target.value)}
        />
        <div className="mb-4">
          <select
            className="text-black border-2 rounded-md p-2 w-full"
            value={gender}
            onChange={(e) => setGender(e.target.value)}
          >
            <option value="">Select Gender</option>
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            <option value="Other">Other</option>
          </select>
        </div>
        <InputField
          type="text"
          placeholder="USN"
          value={usn}
          onChange={(e) => setUsn(e.target.value)}
        />
        <InputField
          type="tel"
          placeholder="Phone"
          value={phone}
          onChange={(e) => setPhone(e.target.value)}
        />
        <InputField
          type="number"
          placeholder="Age"
          value={age}
          onChange={(e) => setAge(e.target.value)}
        />
        <button
          onClick={handleSubmit}
          className={`bg-blue-500 text-white p-2 rounded-md mt-4 hover:bg-blue-600 ${
            isSubmitting ? "opacity-50 cursor-not-allowed" : ""
          }`}
          disabled={isSubmitting}
        >
          {isSubmitting ? "Submitting..." : "Submit"}
        </button>
      </div>
    </div>
  );
}
