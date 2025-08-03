import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view, setView] = useState("books");

  const books = [
    { id: 1, title: "Atomic Habits", author: "James Clear" },
    { id: 2, title: "Deep Work", author: "Cal Newport" },
  ];

  const blogs = [
    {
      id: 1,
      title: "Why React?",
      content: "React is a JS library for building UIs.",
    },
    {
      id: 2,
      title: "Learning ES6",
      content: "ES6 introduced many features like arrow functions.",
    },
  ];

  const courses = [
    { id: 1, name: "React Basics", fee: 1999 },
    { id: 2, name: "Advanced JS", fee: 2499 },
  ];

  // Element variable
  let content;
  if (view === "books") {
    content = <BookDetails books={books} />;
  } else if (view === "blogs") {
    content = <BlogDetails blogs={blogs} />;
  } else if (view === "courses") {
    content = <CourseDetails courses={courses} />;
  } else {
    content = <p>Please select a view</p>;
  }

  return (
    <div style={{ padding: "30px" }}>
      <h1>📰 Blogger App</h1>

      {/* Buttons for toggling views */}
      <button onClick={() => setView("books")}>Show Books</button>
      <button onClick={() => setView("blogs")}>Show Blogs</button>
      <button onClick={() => setView("courses")}>Show Courses</button>

      <hr />

      {content}

      {view === "books" && <p>You're viewing books.</p>}

      <p>
        {view === "courses"
          ? "Courses are available!"
          : view === "blogs"
          ? "Check out the latest blogs!"
          : ""}
      </p>
    </div>
  );
}

export default App;
