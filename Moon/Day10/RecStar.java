package Day10;

import java.util.Scanner;

public class RecStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = "";
        String stars = "*";
        for (int i = 0; i < a; i++){
            result = result + stars;
        }

        for (int i = 0; i < b; i++) {

            System.out.println(result);
        }
    }}
