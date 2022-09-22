import java.util.Scanner;
class Stack {
		static int top=-1;
		static int MAX=1000;
		static int arr[]=new int[MAX];
	
	
	public static boolean isEmpty(){
		return top==-1;
	}
	public static boolean isFull(){
		return (top==MAX-1);
	}
	public static boolean push(int x){
		if(isFull()){
			System.out.println("Stack Overflow");
			return false;
		}
		else{
			arr[++top]=x;
			System.out.println(x+" is pushed ");
			return true;
		}
	}
	public static int pop(){
		if(isEmpty()){
			System.out.println("Stack is underflow");
			return -1;
		}
		else
			return arr[top--];
	}
	public static void printStack(){
			if(isEmpty()){
				System.out.println("Stack is underflow");
			}
			else{
				for(int i=0;i<top+1;i++){
					System.out.print(arr[i]+" ");
				}
			}
	}
}
class StackDriver{
	public static void main(String args[]){
		while(true){
			System.out.println("Please Choose from the given option: ");
			System.out.println("1:Push");
			System.out.println("2.Pop ");
			System.out.println("3.Print the content of the stack ");
			Scanner sc = new Scanner(System.in);
			System.out.print("Input your option : ");
			int Opt = sc.nextInt();
			switch(Opt){
				case 1:
					System.out.println("Please input a no :");
				    int x = sc.nextInt();
					Stack.push(x);
					break;
				case 2:
					int y = Stack.pop();
					if(y!=-1)
						System.out.println("Element popped is: "+y);
					break;
				case 3: 
				    Stack.printStack();
					break;
				default : 
					System.out.println("Please input no in range");
			}
			System.out.println("\nDo you want to continue....Please input y or n");
			char option = sc.next().charAt(0);
			char ans = 'y';
			if(option !=ans){
				break;
			}
			sc.close();
		}
	}
}

		