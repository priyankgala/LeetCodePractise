/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

/*

In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.
Input: root = [1,2,3,4], x = 4, y = 3
Output: false

Reason: Parent of 4 is 2
Parent of 3 is 1
 */
public class D7CousinsInBinaryTree {

    static int dx = 0, dy = 0;
    static Node px = null, py = null;

    public static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    };

    private static boolean isCousin(Node root, int x, int y) {

        findDepth(root, x, y, 0);
        findParent(root, x, y, null);
        return dx == dy && px != py;
    }

    private static void findDepth(Node root, int x, int y, int depth) {

        if (root == null) {
            return;
        }
        if (root.data == x) {
            dx = depth;
        }
        if (root.data == y) {
            dy = depth;
        }
        findDepth(root.left, x, y, depth + 1);
        findDepth(root.right, x, y, depth + 1);

    }

    private static void findParent(Node root, int x, int y, Node parent) {

        if (root == null) {
            return;
        }
        if (root.data == x) {
            px = parent;
        }
        if (root.data == y) {
            py = parent;
        }
        findParent(root.left, x, y, root);
        findParent(root.right, x, y, root);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        System.out.println("Two numbers are cousins or not: " + isCousin(root, 4, 5));

    }
}
