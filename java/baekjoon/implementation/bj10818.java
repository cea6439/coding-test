import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250401(화)
  - 10818번: 최소, 최대 (브론즈3), https://www.acmicpc.net/problem/10818
  - 실행 시간: 452ms
  - 1차: 틀림, ✅2차: 452ms, 3차: 456ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = 1000000;  // 초기값: 최대 정수값
		int max = -1000000; // 초기값: 최소 정수값
		
		for (int i=0; i<n; i++) {
		    int a = Integer.parseInt(st.nextToken());
		    
		    // 최소, 최대 찾기
		    if (min > a) min = a;
		    if (max < a) max = a;
		}
		
		System.out.println(min + " " + max);
	}
}

/*
// 3차 풀이
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.MIN_VALUE;  // 초기값: int 최솟값
		int max = Integer.MAX_VALUE; // 초기값: int 최댓값
		
		for (int i=0; i<n; i++) {
		    int a = Integer.parseInt(st.nextToken());
		    
		    // 최소, 최대 찾기
		    min = Math.min(min, a);
		    max = Math.max(max, a);
		}
		
		System.out.println(min + " " + max);
	}
}
*/
