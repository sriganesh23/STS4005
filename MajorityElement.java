import java.io.*;

class MajorityElement {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 1, 1, 2, 3, 4 };
        int majority = findMajority(arr);
        System.out.println("The majoritiy element is " + majority);
    }

    public static int findMajority(int[] nums) {
        int count = 0, candidate = -1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else {
                if (nums[i] == candidate)
                    count++;
                else
                    count--;
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate)
                count++;
        }
        if (count > (nums.length / 2))
            return candidate;
        return -1;
    }
}