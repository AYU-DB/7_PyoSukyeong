// 문자열 출력하기

import java.util.Scanner;

public class print1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("문자열 입력 : ");
            String str = scanner.next();
            System.out.println("입력 결과 : " + str);
        }
    }
}