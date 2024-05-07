/* 문제 :
  정수 리스트 num_list가 주어질 때, 
  마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
  마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
*/

class array3 {
    public int[] solution(int[] num_list) {
        int length = num_list.length; 
        int answer[] = new int [length + 1]; // num_list보다 1 크게 배열 만듦
        for(int i = 0; i < length; i++)
            answer[i] = num_list[i];
        
        int val = num_list[length - 1] - num_list[length - 2]; // 마지막 원소-그전 원소 
        if(val > 0 ) // 마지막 원소가 더 크면
            answer[length] = val;
        else
            answer[length] = num_list[length - 1] * 2; // 마지막 원소 두 배
        
        return answer;
    }
}
