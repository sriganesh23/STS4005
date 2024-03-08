import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Main m = new Main();
	    Scanner scanner = new Scanner(System.in);
	    Stack<Integer> stk1 = new Stack<>();
	    Stack<Integer> getMin = new Stack<>();
	    int n = scanner.nextInt();
	    while(n!=-1){
	        switch (n){
	            case 1:
	                n=scanner.nextInt();
	                m.push(stk1, getMin, n);
	                break;
	            case 2:
	                if (!stk1.empty()){
    	                m.pop(stk1, getMin);
	                } 
	                else{
	                    System.out.println("Stack is Empty.");
	                }
	                break;
	            case 3:
	                if (!stk1.empty()){
    	                System.out.println(stk1.peek());
	                }
	                else{
	                    System.out.println("Stack is Empty.");
	                }
	                break;
	            case 4:
	                if (!stk1.empty()){
	                    m.getMin(getMin);
	                }
	                else{
	                    System.out.println("Stack is Empty.");
	                }
	                break;
	            default:
	                System.out.println("Invalid Input. Try again!");
	        }
	        n=scanner.nextInt();
	    }
	}
	void getMin(Stack<Integer> getMin){
	    
	
	    if (getMin.empty()){
	       System.out.println("Null");
	    }
	    else{
	        System.out.print(getMin.peek());
	    }
	    
	}
	void push(Stack<Integer> stk1, Stack<Integer> getMin, int n){
	    if (stk1.empty()){
	        stk1.push(n);
	        getMin.push(n);
	    }
	    else{
	        stk1.push(n);
	        if(stk1.peek()<getMin.peek()){
	            getMin.push(n);
	        }
	    }
	}
	void pop(Stack<Integer> stk1, Stack<Integer> getMin){
	    int i = stk1.pop();
	    getMin.remove(Integer.valueOf(i));
	}
}
