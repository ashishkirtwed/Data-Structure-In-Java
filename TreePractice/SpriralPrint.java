/*
 * Write a function to print spiral order traversal of a tree. For below tree, function should print 1, 2, 3, 4, 5, 6, 7
 *                                      1                                     
 *                                2            3 
 *                           7         6  5          4
 * 
 */
package TreePractice;

import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }    
}
class SpiralPrint{
    public static void printSpiral(Node root){
         if(root==null){
            return;
         }   
         //create two stacks here 
         Stack<Node> stk1 = new Stack<Node>();
         Stack<Node> stk2 = new Stack<Node>();
         stk1.push(root);
         ArrayList<Node> arrayList = new ArrayList<>();
         while(!stk1.isEmpty() || !stk2.isEmpty()){
            while(!stk1.isEmpty()){
                Node temp = stk1.pop();
                System.out.print(temp.data+" ");
                if(temp.right!=null){
                    stk2.push(temp.right);
                }
                if(temp.left!=null){
                    stk2.push(temp.left);
                }
                
            }
            while(!stk2.isEmpty()){
                Node temp = stk2.pop();
                System.out.print(temp.data + " ");
                if(temp.left!=null){
                    stk1.push(temp.left);
                }
                if(temp.right!=null){
                    stk1.push(temp.right);
                }
                
            }
         }
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        printSpiral(root);
    }
}
