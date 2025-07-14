import java.io.*;

/*
  - 문제 풀이: 250712(토)
  - [백준/11653] 소인수분해(브론즈1), https://www.acmicpc.net/problem/11653
  - 실행 시간: 136ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while (n != 1) {    // 소인수분해는 n==1 일 때 종료
		    for (int i=2; i<=n; i++) {  // i는 2부터 시작 (∵ 2는 가장 작은 소수)
    		    if (n % i == 0) {   // i가 n의 약수인 경우
    		        n /= i;
    		        System.out.println(i);  // 소인수 출력
    		        break;
    		    }
    		}
		}
	}
}
