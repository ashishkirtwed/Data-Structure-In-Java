/*
 * Write a function to print spiral order traversal of a tree. For below tree, function should print 1, 2, 3, 4, 5, 6, 7
 * tree 1
 *                                      1                                     
 *                                2            3 
 *                           7         6  5          4
 * Tree 2
 *                                      1
 *                                2            3
 *                                       4           5
 *                                            7 6 
 * 
 * 
 * 
 * /
/*
 * Logic : using 2 stacks 
 * Here I am using 2 stack mechanism. 
 * Let's suppose we have 2 stack names stk1 and stk2
 * Step 1: I will push root into stk1 
 * Step 2: I will pop all the nodes from the stk1 or stk2 whichever has nodes 
 *         Initially we have stk1 has nodes and stk2 is empty 
 *         will print popped node
 * step 3: For each node from stk1 I will push right child node of the popped node
 *         and then left child node of the popped node into stk2(left to right print)
 * step 4: Now stk1 is empty and stk2 has nodes, so now one by one I will pop all the nodes
 *         from stk2 and push left child node of popped node and right child node of the popped node 
 *         into stk1 
 * step 5: Repeat step 3 and 4 (internal while loop)
 * step 6: Repeat step 2,3 and 4 (external while loop)
 * 
 * Time Complexity : O(n),Space Complexity: O(n)
 */
package TreePractice.Question1;
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
         while(!stk1.isEmpty() || !stk2.isEmpty()){
            while(!stk1.isEmpty()){
                Node temp = stk1.pop();
                System.out.print(temp.data+" ");
                //pushing into the st2 for printing from left to right 
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
                //pushing into the stk1 for printing from right to left 
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

        //tree 1 
        System.out.println("Tree 1: ");
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(7);
        root1.left.right = new Node(6);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);
        printSpiral(root1);

        //tree 2
        System.out.println("\nTree 2: ");
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.right.left = new Node(4);
        root2.right.right = new Node(5);
        root2.right.left.right = new Node(7);
        root2.right.right.left = new Node(6);
        printSpiral(root2);
    }
}
