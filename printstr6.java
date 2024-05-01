/* 문제 : 
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
*/

import java.util.Scanner;

class printstr6 {
    public static int solution(int a, int b) {
        int answer = 0;
        String aS = Integer.toString(a); // a를 String으로
        String bS = Integer.toString(b); // b를 String으로
        String ab = aS + bS; // a ⊕ b String
        String ba = bS + aS; // b ⊕ a String
        
        int abI = Integer.parseInt(ab); // a ⊕ b int
        int baI = Integer.parseInt(ba); // b ⊕ a int
        
        if(abI >= baI)
            answer = abI;
        else
            answer = baI;
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int output = solution(a, b);
        
        System.out.println(output);
        
        
    }
}
