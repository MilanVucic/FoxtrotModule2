package lesson_7.maze;

import java.util.Random;

public class Maze {
    private TileType[][] grid;

    public Maze(int rows, int columns) {
        grid = new TileType[rows][columns];
        randomlyGenerateMaze();
    }

    private void randomlyGenerateMaze() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 30% chance of having a wall
                int randomNumber = random.nextInt(100);
                if (randomNumber <= 30) {
                    grid[i][j] = TileType.WALL;
                } else {
                    grid[i][j] = TileType.EMPTY;
                }
            }
        }

        int startRow = random.nextInt(grid.length);
        int startColumn = random.nextInt(grid[0].length);
        int exitRow = random.nextInt(grid.length);
        int exitColumn = random.nextInt(grid[0].length);

        grid[startRow][startColumn] = TileType.START;
        grid[exitRow][exitColumn] = TileType.EXIT;
    }

    public void print() {

        printHorizontalBorder();
        System.out.println();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.print(grid[i][j]);
                if (j == grid[i].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        printHorizontalBorder();
    }

    private void printHorizontalBorder() {
        System.out.print(" ");
        for (int i = 0; i < grid[0].length; i++) {
            System.out.print("_");
        }
    }
}
