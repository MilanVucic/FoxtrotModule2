package lesson_7.maze;

public class MazeTester {
    public static void main(String[] args) {
        Maze m = new Maze(10, 10);
        m.print();
        // 1 -> 3 4 5 6 2
        // 2 -> 7 8 9
        // 3 -> 10 11 12
        // 4 -> 13 14 15

        // 7 -> 16 17
        // 8 -> 18 19
        // 10 -> 25
        // 18 -> 20 21
        // 19 -> OUT

        // Stack: 1 2 8 19
        // Visited rooms: 10, 25, 11, 12, 3, 13, 14, 15, 4
        // Set vs ArrayList
    }
}
