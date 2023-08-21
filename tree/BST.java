package tree;

public class BST {
    public static Tree insert(Tree T, int k) {
        if (T == null) {
            T = new Tree(k);

            return T;
        }

        if (T.key > k) {
            T.left = insert(T.left, k);
        } else {
            T.right = insert(T.right, k);
        }

        return T;
    }

    public static void inOrder(Tree T) {
        if (T != null) {
            inOrder(T.left);

            System.out.print(T.key + " ");
            
            inOrder(T.right);
        }
    }

    public static Tree minValue(Tree T) {
        while (T.left != null) {
            T = T.left;
        }

        return T;
    }

    public static Tree delete(Tree T, int k) {
        if (T == null) {
            return T;
        }

        if (T.key > k) {
            T.left = delete(T.left, k);
        } else if (T.key < k) {
            T.right = delete(T.right, k);
        } else {
            if (T.left == null && T.right == null) {
                T = null;
            } else if (T.left != null && T.right != null) {
                Tree min = minValue(T.right);
                T.key = (min).key;
                T.right = delete(T.right, (min).key);
            } else {
                if (T.left == null){
                    T = T.right;
                } else {
                    T = T.left;
                }
            }
        }
        
        return T;
    }

    public static Tree search(Tree T, int k) {
        if (T == null) {
            return null;
        }
        
        if (T.key == k) {
            return T;
        }
        
        if (T.key > k) {
            return search(T.left, k);
        }
            
        return search(T.right, k);
    }
    
    public static void main(String[] args) {
        Tree T = new Tree(8);
        insert(T, 3);
        insert(T, 10);
        insert(T, 1);
        insert(T, 6);
        insert(T, 14);
        insert(T, 7);

        inOrder(T);
        System.out.println();

        delete(T, 3);
        // System.out.println(minValue(T));

        inOrder(T);
        System.out.println();

        Tree a = search(T, 14);
        if (a != null) {
            System.out.println(a.key);
        } else {
            System.out.println(a);
        }
    }
}

// javac -d . tree/BST.java && java tree/BST
