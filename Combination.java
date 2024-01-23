public class Combination {
    public static void main(String args[]) {
        System.out.println("21BEC1234");
        int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;
        int r = 3;
        int com[] = new int[r];
        combinations(arr, n, 0, com, r, 0);
    }

    static void combinations(int[] arr, int n, int i, int[] com, int r, int j) {
        if (j >= r) {
            for (int elt : com) {
                System.out.print(elt + " ");
            }
            System.out.println("");
            return;
        }
        if (i >= n) {
            return;
        }
        com[j] = arr[i];
        combinations(arr, n, i + 1, com, r, j + 1);
        combinations(arr, n, i + 1, com, r, j);
    }
}
