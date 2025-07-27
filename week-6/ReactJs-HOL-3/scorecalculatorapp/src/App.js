import "./App.css";
import { CalculateScore } from "./Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore
        Name="Soumya Agrawal"
        School="J.S.S.S."
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
