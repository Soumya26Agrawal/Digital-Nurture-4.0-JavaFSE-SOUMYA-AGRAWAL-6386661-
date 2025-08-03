import React from "react";

const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h2>📝 Blog Articles</h2>
      {blogs.map((blog, index) => (
        <div key={blog.id || index}>
          <h4>{blog.title}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
};

export default BlogDetails;
