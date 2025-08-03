import React from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
    };

    this.increment = this.increment.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.handleBoth = this.handleBoth.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handleSyntheticEvent = this.handleSyntheticEvent.bind(this);
  }

  increment() {
    this.setState((prevState) => ({
      counter: prevState.counter + 1,
    }));
  }

  sayHello() {
    console.log("Hello! This is a static message from sayHello()");
  }

  handleBoth() {
    this.increment();
    this.sayHello();
  }

  decrement = () => {
    this.setState((prevState) => ({
      counter: prevState.counter - 1,
    }));
  };

  sayWelcome(message) {
    alert(message);
  }

  handleSyntheticEvent(e) {
    e.preventDefault();
    alert("I was clicked");
  }

  render() {
    return (
      <div style={{ padding: "30px", fontFamily: "Arial" }}>
        <h1>🧪 React Event Examples</h1>

        <h2>Counter: {this.state.counter}</h2>

        <button onClick={this.handleBoth}>Increment & Say Hello</button>
        <button onClick={this.decrement} style={{ marginLeft: "10px" }}>
          Decrement
        </button>

        <br />
        <br />

        <button onClick={() => this.sayWelcome("Welcome!")}>Say Welcome</button>

        <br />
        <br />

        <button onClick={this.handleSyntheticEvent}>OnPress</button>

        <br />
        <br />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
