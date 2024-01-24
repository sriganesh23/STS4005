class LeadersN {
    public static void main(String args[]) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int size = arr.length;
        int max_from_right = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (max_from_right < arr[i]) {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }
}