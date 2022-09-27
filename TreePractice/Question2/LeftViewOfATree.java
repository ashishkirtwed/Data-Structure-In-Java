package TreePractice.Question2;

class Node{
    int data;
    Node left,right;
    Node(int x){
        this.data = x;
        this.left =null;
        this.right=null;
    }
}

public class LeftViewOfATree {
    static int max_level=0;
    public void printLeftView(Node root,int level){
        if(root ==null){
            return ; 
        }
        if(max_level<level){
            System.out.print(root.data+" ");
            max_level+=1;
        }
        //recur left and right subtree
        printLeftView(root.left,level+1);
        printLeftView(root.right, level+1);
    }

    public static void main(String args[]){

        LeftViewOfATree leftview = new LeftViewOfATree();

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
          leftview.printLeftView(root1,1);
  
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
          leftview.printLeftView(root2,1);
    }

}
