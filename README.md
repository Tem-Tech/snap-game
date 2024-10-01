# Snap Game

This project is a simple two-player card game written in Java, where each player takes turns drawing cards from a shuffled deck. Players compete to "snap" by typing the word "snap" within 2 seconds when two consecutive cards match. The game automatically handles player turns, and if the player fails to snap or enters an invalid input, the game moves to the next player's turn.

## How It Works

- **Two Players**: Players enter their names at the start of the game.
- **Turn-Based Gameplay**: Each player takes turns drawing cards. If two consecutive cards match, they have 2 seconds to type "snap" to win.
- **Timer**: The game uses a timer for each turn. If a player doesn’t type "snap" or "pass" within 2 seconds, the game moves to the next player.
- **Inputs**: Players can type:
  - `"snap"` to win if there’s a matching card.
  - `"pass"` to skip their turn.
  - Any other input will be considered invalid, and they will lose their chance to snap.

## Running the Game

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/snap-game.git
2. Compile and run the SnapGame class:
    ```bash
    javac SpanGame.java
    java SnapGame

3. Follow the prompts to enter player names and start playing!

## Features
- **Automatic Turn Handling**: The game automatically switches turns after each action (snap, pass, or timeout).
- **Timeout Handling**: If a player fails to snap within 2 seconds, the game automatically moves to the next player.
- **Simple Input System**: Players can input either "snap" to win or "pass" to skip their turn.

## Future Improvements
- Adding a graphical user interface (GUI) for better user experience.
- Extending gameplay to support more than two players.

