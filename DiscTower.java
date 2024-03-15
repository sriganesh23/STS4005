import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=3;
	    char src='A', aux='B', dest='C';
	    tower(n,src,aux,dest);
	}
	static void tower(int n, char src, char aux, char dest){
	    if (n==0)
	        return;
	    tower(n-1,src,dest,aux);
	    System.out.println(src+" "+dest);
	    tower(n-1,aux,src,dest);
	}
}
