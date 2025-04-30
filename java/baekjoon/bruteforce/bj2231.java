import java.io.*;

/*
  - 문제 풀이: 250430(수)
  - 2231번: 분해합 (브론즈2), https://www.acmicpc.net/problem/2231
  - 실행 시간: 256ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=n; i++) {
		    String index = String.valueOf(i);   // i를 String으로 변환
		    char[] arr = index.toCharArray();   // String -> char[]
		    
		    int sum = 0;    // char들의 합
		    for (int j=0; j<arr.length; j++) {
		        sum += (arr[j] - '0');
		    }
		    
		    if (i + sum == n) { 
		        System.out.println(i);  // 분해합이 n과 같은 i 값 출력
		        break;
		    } else if (i == n) {
		        System.out.println(0);
		    }
		}
	}
}
