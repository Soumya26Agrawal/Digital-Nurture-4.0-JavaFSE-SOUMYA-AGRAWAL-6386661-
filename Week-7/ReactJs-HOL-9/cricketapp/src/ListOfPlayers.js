import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 88 },
    { name: "Dhoni", score: 90 },
    { name: "Sachin", score: 60 },
    { name: "Rahul", score: 65 },
    { name: "Pant", score: 45 },
    { name: "Ashwin", score: 75 },
    { name: "Bumrah", score: 85 },
    { name: "Shami", score: 66 },
    { name: "Jadeja", score: 59 },
    { name: "Gill", score: 91 },
  ];

  const playerList = players.map((player, index) => (
    <li key={index}>
      {player.name} - {player.score}
    </li>
  ));

  const lowScorers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{playerList}</ul>

      <h2>Players Scored Below 70</h2>
      <ul>
        {lowScorers.map((p, i) => (
          <li key={i}>
            {p.name} - {p.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
