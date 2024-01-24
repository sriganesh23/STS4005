class QuickSort {
    public static void main(String args[]) {
        int[] arr = { 20, 81, 43, 98, 82, 28, 66 };
        pivotRecursion(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void pivotRecursion(int[] arr, int low, int high) {
        if (low < high) {
            int pivotp = getpivot(arr, low, high);
            pivotRecursion(arr, pivotp + 1, high);
            pivotRecursion(arr, low, pivotp - 1);
        }
    }

    static int getpivot(int[] arr, int low, int high) {
        int pivtelt = arr[high];
        int pivotp = low;
        for (int i = low; i <= high; i++) {
            if (arr[i] < pivtelt) {
                int temp = arr[i];
                arr[i] = arr[pivotp];
                arr[pivotp] = temp;
                pivotp++;
            }
        }
        int tmp = arr[pivotp];
        arr[pivotp] = arr[high];
        arr[high] = tmp;
        return pivotp;
    }
}