package lesson_10.binary_trees;

public class BinaryTree<T extends Comparable<T>> {
    Node<T> root;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (root == null) {
            root = newNode;
        } else {
            add(newNode, root);
        }
    }

    private void add(Node<T> newNode, Node<T> node) {
        // value < root.value
        if (newNode.value.compareTo(node.value) < 0) {
            // go left
            if (node.left == null) {
                node.left = newNode;
            } else {
                add(newNode, node.left);
            }
        } else {
            // go right
            if (node.right == null) {
                node.right = newNode;
            } else {
                add(newNode, node.right);
            }
        }
    }

    // LMR
    public void printInOrder() {
        printHelper(root);
    }

    public void printDesc() {
        printHelperDesc(root);
    }

    private void printHelperDesc(Node<T> node) {
        if (node == null) {
            return;
        }
        if (node.right != null) {
            printHelperDesc(node.right);
        }
        System.out.println(node.value);
        if (node.left != null) {
            printHelperDesc(node.left);
        }
    }

    // TODO: return the level on which this value is found, -1 if not found
    public int foundOnLevel(T value) {
        return -1;
    }

    private void printHelper(Node<T> node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            printHelper(node.left);
        }
        System.out.println(node.value);
        if (node.right != null) {
            printHelper(node.right);
        }
    }

    public boolean find(T value) {
        return findHelper(value, root);
    }

    private boolean findHelper(T value, Node<T> node) {
        if (node == null) {
            return false;
        }
        if (value.compareTo(node.value) == 0) {
            return true;
        }
        if (value.compareTo(node.value) > 0) {
            return findHelper(value, node.right);
        } else {
            return findHelper(value, node.left);
        }
    }

    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node<T> node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int getSize() {
        return getSize(root);
    }

    private int getSize(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSize(node.left) + getSize(node.right);
    }

}
