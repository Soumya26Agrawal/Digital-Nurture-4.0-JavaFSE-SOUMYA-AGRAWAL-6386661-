import React, { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault(); // Synthetic event
    const converted = parseFloat(rupees) / 89.45;
    setEuro(converted.toFixed(2));
  };

  return (
    <div style={{ marginTop: "40px" }}>
      <h2>💱 Currency Converter (INR ➡️ EUR)</h2>

      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter INR"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
        <button type="submit" style={{ marginLeft: "10px" }}>
          Convert
        </button>
      </form>

      {euro !== null && (
        <p>
          💶 Euro: <strong>{euro}</strong>
        </p>
      )}
    </div>
  );
}

export default CurrencyConvertor;
