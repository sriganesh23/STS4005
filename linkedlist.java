import java.util.*;
public class Main
{
	Main head, tail, temp;
	int data;
	Main next;
	Main(int v){
	    data = v;
	    next=null;
	}
	void add(int d){
	    Main new_Node = new Main(d);
	    if (head==null){
	        head = new_Node;
	        tail = new_Node;
	    }
	    else{
	        tail.next=new_Node;
	        tail=tail.next;
	    }
	}
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    Main m = new Main(0);
	    int n = obj.nextInt();
	    while (n>=0){
	        m.add(n);
	        n=obj.nextInt();
	    }
	    int k = obj.nextInt();
	    m.temp = m.head;
	    boolean b=false;
	    while (m.temp!=null){
	        if (m.temp.data==k){
	            System.out.println("Loop is detected.");
	            b=true;
	            break;
	        }
	        m.temp=m.temp.next;
	        if (!b)
	            System.out.println("Loop is not detected.");
	    }
		ArrayList<Integer> arr = new ArrayList<>();
		int m = obj.nextInt();
		while (m>0){
		    arr.add(m);
		    m=obj.nextInt();
		}
		int k1 = obj.nextInt();
		for (int i:arr){
		    if (i==k1){
		        System.out.println("Loop detected");
		        b=true;
		        break;
		    }
		}
	}
}
