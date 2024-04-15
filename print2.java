/*
 a와 b를 입력 받고 다음을 출력 (num은 입력받은 값)
 a = num 
 b = num
 */

import java.util.Scanner;

public class print2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("a = " + a + "\nb = " + b);
        }
    }
}
