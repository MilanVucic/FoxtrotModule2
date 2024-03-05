package lesson_7.maze;

public enum TileType {
    EMPTY,
    WALL,
    START,
    EXIT;

    @Override
    public String toString() {
        return switch (this) {
            case EMPTY -> " ";
            case WALL -> "#";
            case START -> "S";
            case EXIT -> "E";
        };
    }
}
