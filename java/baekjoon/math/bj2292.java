import java.io.*;

/*
  - 문제 풀이: 250429(화)
  - 2292번: 벌집 (브론즈2), https://www.acmicpc.net/problem/2292
  - 실행 시간: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 1;
		
		for (int i=1; i<=n; i++) {
		    if (n <= range) {
		        break;  // 범위 안에 들어오면 반복문 탈출
		    }
		    range += 6*i;   // 6의 배수 누적
		    count++;    // 개수++
		}
		
		System.out.println(count);
	}
}
