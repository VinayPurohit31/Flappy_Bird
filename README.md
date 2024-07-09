
# Flappy Bird Game with LibGDX

This is a simple Flappy Bird game implemented using the LibGDX framework. The game includes features such as scoring, collision detection, and a game over screen with an option to restart the game.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- Gradle
- LibGDX

## Setup

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/flappybird-libgdx.git
cd flappybird-libgdx
```

### 2. Import the Project

Open your preferred IDE (such as IntelliJ IDEA or Eclipse) and import the project as a Gradle project.

### 3. Add Assets

Ensure you have the following assets in the `assets` directory:

- `bg.png` - Background image
- `bird.png` - First bird image
- `bird2.png` - Second bird image
- `gameover.png` - Game over image
- `toptube.png` - Top tube image
- `bottomtube.png` - Bottom tube image
- `myfont.fnt` - High-resolution font file (generate using Hiero)
- `myfont.png` - Font texture file (generate using Hiero)

### 4. Run the Game

You can run the game using the following Gradle command:

```bash
./gradlew desktop:run
```

Alternatively, you can run the `DesktopLauncher` class from your IDE.

## Code Explanation

### Main Game Class

The main game logic is implemented in the `FlappyBird` class. Here are some key points:

- **Initialization**: The `create` method initializes the game assets and variables.
- **Game States**: The game has three states: `0` (start), `1` (running), and `2` (game over).
- **Rendering**: The `render` method handles the game loop, including drawing the background, bird, tubes, and score.
- **Collision Detection**: Collision detection is performed using `Intersector.overlaps` to check for collisions between the bird and the tubes.
- **Restart Game**: When the game is over, touching the screen restarts the game.


### Assets

Make sure all the required assets are available in the `assets` directory. You can download or create your own images for the background, bird, tubes, and game over screen.

## Contributing

Feel free to fork this repository and make improvements. Pull requests are welcome.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [LibGDX](https://libgdx.com/) - The game framework used in this project

```

This `README.md` file includes instructions on how to set up and run the game, explains the main parts of the code, and lists the necessary assets. Make sure to update the repository URL in the clone command and the `LICENSE` file if needed.
