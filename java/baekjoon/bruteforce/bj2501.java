import java.io.*;
import java.lang.*;
import java.util.*;

/*
  - 문제 풀이: 250415(화)
  - 2501번: 약수 구하기 (브론즈3), https://www.acmicpc.net/problem/2501
  - 실행 시간: 100ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer  st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int count = 0;  // 약수 개수
		
		for (int i=1; i<=n; i++) {
		        if (n % i == 0) {
		            count++;
		            
		            if (count == k) {
		                System.out.println(i);  // k번쨰 약수
		            }
		        }
		}
		
		if (count < k) {
			System.out.println(0);  // k번째 약수가 없는 경우 0 출력
		}
	}
}
