import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5};
        int[] num2 = new int[num1.length];;
        int k = 0;

        for (int i = 0; i < num1.length-1; i++) {
            for (int j = i + 1; j < num1.length-1; j++) {
                if (num1[i] != num1[j]) {
                    k += 1;
                    num2[i] = num1[i] ;
                }
            }

        }

        System.out.println(k);
    }




}