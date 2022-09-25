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
 */
/*                                          Dequeue 
 *                                          
 *                                         iterable(interface)
 *                                                  *
 *                                                  |(extends)
 *                                                  |
 *                                         Collection(interface)
 *                                                   *
 *                                                   |(extends)
 *                                                   |
 *                                          Queue(interface) *-------------
 *                                                   *                    | (implements)
 *                                                   |(extends)     PriorityQueue
 *                                                   |                  (class)
 *                                            Deque(inteface)
 *                                                   *       
 *                                    _______________|_______________
 *                                   |(implements)                  |(implements)
 *                            LinkedList(class)                ArrayDeque(class)
 *
 * ****understand pollFirst, pollLast, offerFirst and offerLast properly first if you don't know       
 *                                      
 */
package TreePractice.Question1;

import java.util.ArrayDeque;
import java.util.Deque;

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
public class SpiralPrintUsingDeQueue{
    public static void printSpiral(Node root){
        //declaring a deque
        Deque<Node> dq = new ArrayDeque<Node>();
        dq.offer(root);
        //flag to change the order from left to right and right to left 
        //if flag is true  -- print left to right 
        //if flag is false -- print right to left 
        boolean flag = true;
        //iterate until deque is empty 
        while(!dq.isEmpty()){
            int n = dq.size();
            if(flag){
                for(int i=0;i<n;i++){
                    //add right child of dequed node into head of the deque
                    if(dq.peekLast().right!=null){
                        dq.offerFirst(dq.peekLast().right);
                    }
                    //add left child of dequed node into head of the deque
                    if(dq.peekLast().left!=null){
                        dq.offerFirst(dq.peekLast().left);
                    }
                    System.out.print(dq.pollLast().data+" ");
                }
                flag = !flag;
            }
            else{
                for(int i=0;i<n;i++){
                    //add left child of dequed node into last of the deque
                    if(dq.peekFirst().left!=null){
                        dq.offerLast(dq.peekFirst().left);
                    }
                    //add left child of dequed node into last of the deque
                    if(dq.peekFirst().right!=null){
                        dq.offerLast(dq.peekFirst().right);
                    }
                    System.out.print(dq.pollFirst().data+" ");
                }
                flag=!flag;
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