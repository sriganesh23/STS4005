import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int n = obj.nextInt();
	    int arr[] = new int[n];
	    for (int i=0;i<n;i++){
	        arr[i]=obj.nextInt();
	    }
	    int ascORdes = obj.nextInt();
	    
	}
	void sort(int arr[], int l, int h, int ascORdes){
	    if (h>1){
	        int m=h/2;
	        sort(arr,l,m,1); // Ascending order
	        sort(arr,l+m,m,0); // Descending order
	        bitonicSort(arr,l,h,ascORdes);
	    }
	}
	void bitonicSort(int arr[],int l, int h, int ascORdes){
	    if (h>1){
	        for (int i=l;i<l+h;i++){
	            swap(arr,l,h,ascORdes);
	        }
	        bitonicSort(arr,l,h,ascORdes);
	        bitonicSort(arr,l+h,h,ascORdes);
	    }
	}
	void swap(int arr[], int l, int h, int ascORdes){
	    //int l,h;
	    if (((arr[l]>arr[h]) && ascORdes==1)||((arr[l]<arr[h]) && ascORdes==0)){
	        int temp = arr[l];
	        arr[l] = arr[h];
	        arr[h]=temp;
	    }
	}
}
