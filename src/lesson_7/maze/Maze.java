package lesson_7.maze;

import java.util.*;

public class Maze {
    private Tile[][] grid;
    private Tile startTile;
    private Tile exitTile;

    public Maze(int rows, int columns) {
        grid = new Tile[rows][columns];
        randomlyGenerateMaze();
    }

    private void randomlyGenerateMaze() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 30% chance of having a wall
                int randomNumber = random.nextInt(100);
                if (randomNumber <= 30) {
                    grid[i][j] = new Tile(TileType.WALL, i, j);
                } else {
                    grid[i][j] = new Tile(TileType.EMPTY, i, j);
                }
            }
        }

        int startRow = random.nextInt(grid.length);
        int startColumn = random.nextInt(grid[0].length);
        int exitRow = random.nextInt(grid.length);
        int exitColumn = random.nextInt(grid[0].length);

        startTile = new Tile(TileType.START, startRow, startColumn);
        exitTile = new Tile(TileType.EXIT, exitRow, exitColumn);

        grid[startRow][startColumn] = startTile;
        grid[exitRow][exitColumn] = exitTile;

    }

    public void print() {

        printHorizontalBorder();
        System.out.println();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.print(grid[i][j].getConsoleDisplay());
                if (j == grid[i].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        printHorizontalBorder();
    }

    public void findSolution() {
        Stack<Tile> stack = new Stack<>();
        stack.push(startTile);
        Set<Tile> visited = new HashSet<>();

        while (!stack.isEmpty()) {
            Tile current = stack.peek();
            if (current.tileType == TileType.EXIT) {
                System.out.println("Solution:" + stack);
                return;
            }
            visited.add(current);

            List<Tile> neighbours = new ArrayList<>();
            // top tile
            if (current.row > 0 &&
                    !visited.contains(grid[current.row - 1][current.column])
                    && grid[current.row - 1][current.column].tileType != TileType.WALL) {
                neighbours.add(grid[current.row - 1][current.column]);
            }
            // bottom tile
            if (current.row < grid.length - 1 &&
                    !visited.contains(grid[current.row + 1][current.column])
                    && grid[current.row + 1][current.column].tileType != TileType.WALL) {
                neighbours.add(grid[current.row + 1][current.column]);
            }
            // left tile
            if (current.column > 0 &&
                    !visited.contains(grid[current.row][current.column - 1])
                    && grid[current.row][current.column - 1].tileType != TileType.WALL) {
                neighbours.add(grid[current.row][current.column - 1]);
            }
            // right tile
            if (current.column < grid[0].length - 1 &&
                    !visited.contains(grid[current.row][current.column + 1])
                    && grid[current.row][current.column + 1].tileType != TileType.WALL) {
                neighbours.add(grid[current.row][current.column + 1]);
            }

            if (neighbours.isEmpty()) {
                stack.pop();
            } else {
                stack.push(neighbours.get(0));
            }
        }
        System.out.println("No exit found...");
    }

    private void printHorizontalBorder() {
        System.out.print(" ");
        for (int i = 0; i < grid[0].length; i++) {
            System.out.print("_");
        }
    }
}
