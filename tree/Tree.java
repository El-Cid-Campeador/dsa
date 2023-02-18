package tree;

public class Tree {
    int key;
    Tree left;
    Tree right;
    int height;

    public Tree(int k) {
        this.key = k;
        this.left = null;
        this.right = null;
    }
}
