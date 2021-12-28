/*Inside Collection framework
				Collection
					*
					|
					|
				 List(I)
				    *
				    |
					|
				 Vector
				    |
					|
				  Stack
in order to create a Stack, we should have to import java.util.Stack. 
Syntax: 
       Stack<type> stacks = new Stacks<>();
Creating an stack for integer elements
		Stack <Integer> stk1= new Stack<>();
Creating an Stack for String elements
        Stack <String> stk2 = new Stack<>();
*/
// program to reverse a String using Stack class
import java.util.Stack;
import java.util.Scanner;
class InbuiltStack{
	public static void main(String args[]){
		Stack<Character> stk = new Stack<>();//char is a primitive type so I used 
		//Character wrapper class.
		System.out.println("Please input a String to reverse");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//String ans = "";
		for(int i=0;i<s.length();i++)
			stk.push(s.charAt(i));
		System.out.print("Reversed String is: ");
		int n=stk.size(); //to find size of the stack.
		for(int i=0;i<n;i++)
			System.out.print(stk.pop());
			
	}
}
		
			
		
		
		
	
	
	
	