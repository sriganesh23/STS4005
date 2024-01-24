import java.util.HashMap;
import java.io.*;

class ModeN {
    public static void main(String args[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ct = 0;
        int arr[] = { 2, 4, 3, 4, 4 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], 0);
        }
        int max = 0, index = 0;
        for (int i = 0; i < n; i++) {
            ct = map.get(arr[i]) + 1;
            map.put(arr[i], ct);
            if (ct > max) {
                max = ct;
                index = i;
            }
        }
        if (max > n / 2)
            System.out.println("Majority element: " + arr[index]);
        else
            System.out.println("No majority element");
    }
}