import React from "react";

const BookDetails = ({ books }) => {
  return (
    <div>
      <h2>📚 Book List</h2>
      <ul>
        {books.map((book, index) => (
          <li key={book.id || index}>
            {book.title} - {book.author}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BookDetails;
