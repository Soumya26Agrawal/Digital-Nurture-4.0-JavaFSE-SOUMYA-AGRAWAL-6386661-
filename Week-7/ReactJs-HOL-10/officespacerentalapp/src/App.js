import React from "react";
import "./App.css"; // Optional for external CSS

function App() {
  const headingStyle = {
    textAlign: "center",
    color: "navy",
    marginTop: "20px",
  };

  const officeImage =
    "https://images.unsplash.com/photo-1590490360181-1e12a1d65542?auto=format&fit=crop&w=800&q=80";

  const offices = [
    { name: "Tech Tower", rent: 50000, address: "Indiranagar, Bangalore" },
    { name: "Code Plaza", rent: 75000, address: "Kondapur, Hyderabad" },
    { name: "Startup Hub", rent: 45000, address: "Hinjewadi, Pune" },
    { name: "Growth Arena", rent: 82000, address: "Salt Lake, Kolkata" },
  ];

  return (
    <div className="App">
      <h1 style={headingStyle}>🏢 Office Space Rental</h1>

      <img
        src={officeImage}
        alt="Office Space"
        style={{
          width: "70%",
          height: "auto",
          display: "block",
          margin: "auto",
          borderRadius: "10px",
        }}
      />

      <div style={{ padding: "30px" }}>
        {offices.map((office, index) => (
          <div
            key={index}
            style={{
              border: "1px solid #ccc",
              borderRadius: "8px",
              padding: "15px",
              marginBottom: "20px",
              boxShadow: "2px 2px 8px rgba(0,0,0,0.1)",
            }}
          >
            <h2>{office.name}</h2>
            <p>
              <strong>Address:</strong> {office.address}
            </p>
            <p>
              <strong>Rent:</strong>{" "}
              <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
                ₹{office.rent.toLocaleString()}
              </span>
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
