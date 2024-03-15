import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n = 4,count=0,index=-1,celeb=0;
	    int arr[][]={{0,1,1,0},{1,0,1,0},{0,0,0,0},{0,0,1,0}};
	    for (int i=0;i<n;i++){
	        for (int j=0;j<n;j++){
	            if (arr[i][j]==0)
	                count++;
	            else
	                break;
	        }
	        if (count==n){
	            celeb++;
	            index=i;
	        }
	    }
    
        if(celeb==1){
            count=0;
            for (int i=0;i<n;i++){
                if (i!=index){
                    if (arr[i][index]==1){
                        count++;
                    }
                }
            }
            if (count==n-1){
                System.out.println("Celebrity ID: "+index);
            }
            else{
                System.out.println("No Celebrity");
            }
        }
        else{
            System.out.println("No Celebrity");
        }
	}
}
