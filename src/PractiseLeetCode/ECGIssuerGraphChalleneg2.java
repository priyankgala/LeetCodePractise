/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.util.Vector;

/**
 *
 * @author kinja
 */

class Node
{
        int data;
        Node leftmost, rightmost;

        public Node(int data)
        {
                this.data = data;
                leftmost = rightmost = null;
        }
}
class BinaryNode{
        Node root;

        
        void storeBSTNodes(Node root, Vector<Node> Nodes)
        {
                // This is the Base case
                if (root == null)
                        return;

                // To store in order
                storeBSTNodes(root.leftmost, Nodes);
                Nodes.add(root);
                storeBSTNodes(root.rightmost, Nodes);
        }

        /* The function to construct BT */
        Node buildNodeUtil(Vector<Node> Nodes, int start,
                        int end)
        {
                // This is the base case
                if (start > end)
                        return null;

                
                int mid = (start + end) / 2;
                Node Node = Nodes.get(mid);

                
                Node.leftmost = buildNodeUtil(Nodes, start, mid - 1);
                Node.rightmost = buildNodeUtil(Nodes, mid + 1, end);

                return Node;
        }

        // Converting degenrate into balaced
        Node buildNode(Node root)
        {
        
                Vector<Node> Nodes = new Vector<Node>();
                storeBSTNodes(root, Nodes);

                // Constucts BST from Nodes[]
                int n = Nodes.size();
                return buildNodeUtil(Nodes, 0, n - 1);
        }

        
        void preOrder(Node Node)
        {
                if (Node == null)
                        return;
                System.out.print(Node.data + " ");
                preOrder(Node.leftmost);
                preOrder(Node.rightmost);
        }

        
        public static void main(String[] args)
        {
                
                BinaryNode Node = new BinaryNode();
                Node.root = new Node(20);
                Node.root.leftmost = new Node(16);
                Node.root.leftmost.leftmost = new Node(14);
                Node.root.leftmost.leftmost.leftmost = new Node(12);
                Node.root.leftmost.leftmost.leftmost.leftmost = new Node(10);
                Node.root.leftmost.leftmost.leftmost.leftmost.leftmost = new Node(8);
                Node.root.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost = new Node(10);
                Node.root.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost = new Node(6);
                Node.root.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost = new Node(4);
                Node.root.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost.leftmost = new Node(2);


                Node.root = Node.buildNode(Node.root);
                System.out.println("Traversal of complete balanced Node is :");
                Node.preOrder(Node.root);
        }
}

public class ECGIssuerGraphChalleneg2 {
    
}
