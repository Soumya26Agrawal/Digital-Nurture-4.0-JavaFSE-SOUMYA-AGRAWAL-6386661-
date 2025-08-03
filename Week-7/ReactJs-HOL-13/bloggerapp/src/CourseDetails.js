import React from "react";

const CourseDetails = ({ courses }) => {
  return (
    <div>
      <h2>📖 Courses Offered</h2>
      <ul>
        {courses.map((course, index) => (
          <li key={course.id || index}>
            {course.name} — ₹{course.fee}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default CourseDetails;
