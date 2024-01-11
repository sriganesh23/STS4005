import java.util.*;

class EquiSum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int l = 0;
            for (int j = 0; j <= i; j++) {
                l += arr[j];
            }
            int r = 0;
            for (int j = i; j < n; j++) {
                r += arr[j];
            }
            if (l == r) {
                res = Math.max(res, l);
            }
        }
        System.out.println(res);
    }
}