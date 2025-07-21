import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250720(일)
  - [백준/1110] 더하기 사이클(브론즈1), https://www.acmicpc.net/problem/1110
  - 실행 시간: 104ms
  - 1차: 128ms, ✅ 2차: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    int n = Integer.parseInt(br.readLine());
	    
      if (n < 10) {
          n *= 10; // 10보다 작으면 뒤에 0 붙임
      }
        
      int temp = n;
	    int sum = 0;
	    int result = -1;
	    int cycle = 0;
	    
	    while (true) {
	        cycle++;
	        
          // 분해합
          sum = temp % 10;
          sum += temp / 10;
            
	        result = (temp % 10 * 10) + (sum % 10); // temp 1의 자리, sum 10의 자리 붙인 값

	        if (n == result) {
            break;  // 원래 수 n과 똑같으면 반복문 탈출
	        }
	        
	        temp = result;  // 원래 수와 다르면 temp에 result 대입
	    }
	    
	    System.out.print(cycle);
	}
}
