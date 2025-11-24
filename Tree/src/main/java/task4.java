class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTreeBuilder {
    int preIndex = 0;

    Node buildTree(int[] preorder, int[] inorder, int start, int end) {
        if (start > end)
            return null;

        Node root = new Node(preorder[preIndex++]);

        if (start == end)
            return root;

        int inIndex = search(inorder, start, end, root.data);

        root.left = buildTree(preorder, inorder, start, inIndex - 1);
        root.right = buildTree(preorder, inorder, inIndex + 1, end);

        return root;
    }

    int search(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }

    void printInorder(Node root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }
}

public class task4 {
    public static void main(String[] args) {
        BinaryTreeBuilder tree = new BinaryTreeBuilder();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Node root = tree.buildTree(preorder, inorder, 0, inorder.length - 1);
        System.out.print("Inorder traversal of constructed tree: ");
        tree.printInorder(root);
    }
}

