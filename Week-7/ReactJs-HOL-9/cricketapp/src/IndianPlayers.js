import React from "react";

const IndianPlayers = () => {
  const players = ["Virat", "Rohit", "Dhoni", "Pant", "Gill", "Bumrah"];

  const [p1, p2, p3, p4, p5, p6] = players;
  const oddTeam = [p1, p3, p5];
  const evenTeam = [p2, p4, p6];

  const T20players = ["Kohli", "Hardik", "Rahul"];
  const RanjiTrophyPlayers = ["Pujara", "Jadeja", "Ashwin"];

  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team</h2>
      <ul>
        {oddTeam.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>

      <h2>Even Team</h2>
      <ul>
        {evenTeam.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>

      <h2>Merged Players (T20 + Ranji)</h2>
      <ul>
        {allPlayers.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
