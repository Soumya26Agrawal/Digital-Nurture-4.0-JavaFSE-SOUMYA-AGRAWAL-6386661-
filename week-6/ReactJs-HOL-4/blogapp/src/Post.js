const Post = ({ title, body }) => {
  return (
    <div style={{ border: "1px solid grey", margin: "10px", padding: "10px" }}>
      <h2>{title}</h2>
      <p>{body}</p>
    </div>
  );
};

export default Post;
