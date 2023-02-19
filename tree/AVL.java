package tree;

public class AVL {
    public static int height(Tree T) {
        if (T == null){
            return -1;
        } 
        return T.height;
    }

    public static int BF(Tree T) {
        if (T == null) {
            return 0;
        }
        return height(T.left) - height(T.right);
    }

    public static Tree RotateLeft(Tree x) {
        Tree y = x.right;
        x.right = y.left;
        y.left = x;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    public static Tree RotateRight(Tree y) {
        Tree x = y.left;
        y.left = x.right;
        x.right = y;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    public static Tree rebalance(Tree T, int k) {
        int bf = BF(T);

        if (bf < -1) {
            if (BF(T.right) < 0) {
                T = RotateLeft(T);
            } else {
                T.right = RotateRight(T.right);
                T = RotateLeft(T);
            }
        }

        if (bf > 1) {
            if (BF(T.left) > 0) {
                T = RotateRight(T);
            } else {
                T.left = RotateLeft(T.left);
                T = RotateRight(T);
            }
        }

        // if (bf > 1) {
        //     if (k < T.left.key) {
        //       T = RotateRight(T);
        //     } else {
        //       T.left = RotateLeft(T.left);
        //       T = RotateRight(T);
        //     }
        // }

        // if (bf < -1) {
        //     if (k > T.right.key) {
        //         T = RotateLeft(T);
        //     } else {
        //         T.right = RotateRight(T.right);
        //         T = RotateLeft(T);
        //     }
        // }

        return T;
    }

    public static Tree insertAVL(Tree T, int k) {
        T = BST.insert(T, k);

        T.height = 1 + Math.max(height(T.left), height(T.right));

        return rebalance(T, k);
    }

    public static Tree deleteAVL(Tree T, int k) {
        T = BST.delete(T, k);

        T.height = 1 + Math.max(height(T.left), height(T.right));

        return rebalance(T, k);
    }

    public static void inOrder(Tree T) {
        if (T != null) {
            inOrder(T.left);
            System.out.print(T.key + " ");
            inOrder(T.right);
        }
    }
    public static void main(String[] args) {
        Tree T = new Tree(1);

        insertAVL(T, 2);
        insertAVL(T, 4);
        insertAVL(T, 5);
        insertAVL(T, 6);
        insertAVL(T, 9);
        insertAVL(T, 10);
        insertAVL(T, 13);

        inOrder(T);
        System.out.println();

        deleteAVL(T, 9);
    }
}

// javac -d . tree/AVL.java; java tree/AVL
