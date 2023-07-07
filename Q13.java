public static Node lca(Node root, int p, int q) {
      	// Write your code here.
        if (root == null || root.data == p || root.data == q) {
            return root;
        }

        if (p < root.data && q < root.data) {
            return lca(root.left, p, q);
        } else if (p > root.data && q > root.data) {
            return lca(root.right, p, q);
        } else {
            return root;
        }
    }

// Sample Input
// n = 6
// tree = 4 2 3 1 7 6
// two nodes = 1 7

// Sample Output

// [reference to node 4]

// Explanation

// LCA of  and  is , the root in this case.
// Return a pointer to the node.
