/*문제 : 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 
각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요. */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        int temp; // 임시
        
        for(int i = 0; i < a.length(); i++)
        {
            temp = (int)a.charAt(i);
            if(temp >= 97 && temp <= 122) // 소문자인 경우
                 output += (char)(temp - 32); // 대문자로 바꿈
            else if (temp >= 65 && temp <= 90) // 대문자인 경우
                 output += (char)(temp + 32); // 소문자로 바꿈
        }
        
        System.out.println(output);
    }
}
