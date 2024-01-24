import java.util.*;

class Permutation {
    static int total = 0;

    static void permute(int i, String s) {
        if (i == (s.length() - 1)) {
            System.out.print(s + "\n");
            total++;
            return;
        }
        char prev = '*';
        for (int j = i; j < s.length(); j++) {
            char[] temp = s.toCharArray();
            if (j > i && temp[i] == temp[j])
                continue;
            if (prev != '*' && prev == s.charAt(j))
                continue;
            temp = swap(temp, i, j);
            prev = s.charAt(j);
            permute(i + 1, String.valueOf(temp));
        }
    }

    static char[] swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String args[]) {
        String s = "abca";
        s = sortString(s);
        permute(0, s);
        System.out.print("Total distinct permutations = " + total + "\n");
    }
}