import java.io.*;

/*
  - 문제 풀이: 250715(화)
  - [백준/2748] 피보나치 수 2(브론즈1), https://www.acmicpc.net/problem/2748
  - 실행 시간: 108ms
  - 1차: 틀림, ✅ 2차: 108ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n+1]; // int보다 큰 수가 나오기 때문에 long 타입 선언
		
		// 0번째, 1번째 값 초기화
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i=2; i<=n; i++) {
		    arr[i] = arr[i-2] + arr[i-1];   // 2번째부터 바로 앞 두 피보나치 수의 합이 됨
		}
		
		System.out.print(arr[n]);
	}
}
