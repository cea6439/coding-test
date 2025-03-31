import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250331(월)
  - 10872번: 팩토리얼 (브론즈3), https://www.acmicpc.net/problem/10872
  - 실행 시간: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result = 1; // 초기값 1
		
		for (int i=1; i<=n; i++) {
		    result *= i;    // n만큼 순차적으로 곱함 (n!)
		}
		
		System.out.println(result);
	}
}
