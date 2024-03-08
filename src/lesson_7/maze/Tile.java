package lesson_7.maze;

public class Tile {
    TileType tileType;
    int row;
    int column;

    public Tile(TileType tileType, int row, int column) {
        this.tileType = tileType;
        this.row = row;
        this.column = column;
    }

    public String getConsoleDisplay() {
        return tileType.toString();
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", row, column);
    }
}
