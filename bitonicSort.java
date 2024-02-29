import java.util.*;
public class Main
{
    void sort(int arr[], int l, int h, int ascORdesc){
        int k = h/2;
        if (k>1){
            sort(arr,l,k,1);    // Ascending order
            sort(arr,l+k,h k,0);  // Descending order
            mergeSort();
        }
    }
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int n = obj.nextInt();
	    int arr[] = new int[n];
	    for (int i=0;i<n;i++){
	        arr[i]=obj.nextInt();
	    }
	    merge(arr,n);
		System.out.println("Hello World");
	}
}
