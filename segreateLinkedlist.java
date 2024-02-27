import java.util.*;
public class Main
{
    Main head, tail, next, temp;
    int data;
    Main(int v){
        data = v;
        next = null;
    }
    void add(int d){
        Main new_Node = new Main(d);
        if (head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next=new_Node;
            tail = new_Node;
        }
    }
    void segregate(Main h){
        Main eh=null,et=null, oh=null,ot=null;
        temp=h;
        while(temp!=null){
            if (temp.data%2==0){
	            if (eh==null){
	                eh = temp;
	                et=temp;
	            }
	            else{
	                et.next=temp;
	                et=temp;
	            }
	        }
	        else{
	            if (oh==null){
	                oh=temp;
	                ot=temp;
	            }
	            else{
	                ot.next=temp;
	                ot=temp;
	            }
	        }
	        temp=temp.next;
        }
        ot.next=null;
        et.next=null;
        ot.next=eh;
        temp=oh;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    Main m = new Main(0);
	    int n = obj.nextInt();
	    while(n!=-1){
	        m.add(n);
	        n=obj.nextInt();
	    }
	    m.segregate(m.head);
	}
}
