package javacodegeeks.com;
import java.util.ArrayList;
import java.util.Scanner;

class BSTNode {
    int key;
    BSTNode left, right;

    public BSTNode(int num) {
        key = num;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BSTNode) {
            BSTNode other = (BSTNode)obj;
            if(key == other.key && (left == other.left || left != null && left.equals(other.left))
                    && (right == other.right || right != null && right.equals(other.right))) {
                return true;
            }
        }
        return false;
    }
}

public class SortedArrayToBST {

    BSTNode root;

    public static SortedArrayToBST getBST(int N, int[] arr) {
        SortedArrayToBST bst = new SortedArrayToBST();

        bst.root = insertIntoBST(arr, 0, N - 1);

        return bst;
    }

    private static BSTNode insertIntoBST(int[] arr, int low, int high) {
        if (low > high) {
            return null;
        }

        int mid = (low + high) / 2;

        BSTNode node = new BSTNode(arr[mid]);
        node.left = insertIntoBST(arr, low, mid - 1);
        node.right = insertIntoBST(arr, mid + 1, high);

        return node;
    }

    public void preorder(BSTNode node, ArrayList<Integer> result) {
        if (node != null) {
            result.add(node.key);
            preorder(node.left, result);
            preorder(node.right, result);
        }
    }

    public ArrayList<Integer> preorder() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        preorder(root, result);
        return result;
    }


    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();

            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();
                int[] arr = new int[N];

                for (int i = 0; i < N; i++) {
                    arr[i] = scanner.nextInt();
                }

                SortedArrayToBST bst = SortedArrayToBST.getBST(N, arr);
                ArrayList<Integer> result = bst.preorder();

                result.iterator().forEachRemaining(x -> System.out.print(x + " "));
                System.out.println();
            }
        }
    }
}
