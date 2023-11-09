package Day9;

import java.util.Arrays;
import java.util.Collections;

public class sortStringDesc {
    public static void main(String[] args) {
        System.out.println(bubble("Zbcdefg"));
        System.out.println(sort("Zbcdefg"));
        // gfedcbZ
    }

    private static String sort(String s) {
        String result = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (String str : arr) {
            result += str;
        }

        return result;
    }

    private static String bubble(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return String.valueOf(arr);
    }
}
