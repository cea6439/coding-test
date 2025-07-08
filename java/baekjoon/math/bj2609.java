import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250708(화)
  - [백준/2609] 최대공약수와 최소공배수(브론즈1), https://www.acmicpc.net/problem/2609
  - 실행 시간: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		int result1 = 0;
		int result2 = 0;
		
		for (int i=1; i<=Math.min(n1, n2); i++) {
		    if (n1 % i == 0 && n2 % i == 0) {
		        result1 = i;    // 최대공약수
		    }
		}
		
		result2 = result1 * (n1/result1) * (n2/result1);    // 최소공배수
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
