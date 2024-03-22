package lesson_10.binary_trees;

public class BinaryTester {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(50);
        binaryTree.add(75);
        binaryTree.add(65);
        binaryTree.add(33);
        binaryTree.add(40);
        binaryTree.add(79);
        binaryTree.add(11);
        binaryTree.add(13);
        binaryTree.add(115);
        binaryTree.add(15);
        binaryTree.add(120);
        binaryTree.add(130);

        System.out.println(binaryTree.getHeight());
    }
}
