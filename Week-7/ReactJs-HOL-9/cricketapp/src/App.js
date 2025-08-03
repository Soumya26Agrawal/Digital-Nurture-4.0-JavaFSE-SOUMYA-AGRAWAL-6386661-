import React from "react";
import ListofPlayers from "./ListOfPlayers";
import IndianPlayers from "./IndianPlayers";

function App() {
  const flag = true; // Change this to false to switch components

  return (
    <div className="App">
      <h1>🏏 Welcome to Cricket App</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
