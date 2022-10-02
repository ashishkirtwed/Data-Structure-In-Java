package TreePractice.Question2;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int x){
        this.data = x;
        this.left =null;
        this.right=null;
    }
}

public class LeftViewOfATreeUsingQueue {
    
    public void printLeftView(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n;i++){
                Node temp = q.poll();
                if(i==0){
                    System.out.print(temp.data+" ");
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        LeftViewOfATreeUsingQueue leftview = new LeftViewOfATreeUsingQueue();

          //tree 1 
          System.out.println("Tree 1: ");
          LeftViewOfATree.max_level=0;
          Node root1 = new Node(1);
          root1.left = new Node(2);
          root1.right = new Node(3);
          root1.left.left = new Node(7);
          root1.left.right = new Node(6);
          root1.right.left = new Node(5);
          root1.right.right = new Node(4);
          leftview.printLeftView(root1);
  
          //tree 2
          System.out.println("\nTree 2: ");
          LeftViewOfATree.max_level=0;
          Node root2 = new Node(1);
          root2.left = new Node(2);
          root2.right = new Node(3);
          root2.right.left = new Node(4);
          root2.right.right = new Node(5);
          root2.right.left.right = new Node(7);
          root2.right.right.left = new Node(6);
          leftview.printLeftView(root2);
    }

}
