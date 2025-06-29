import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250616(월)
  - [백준/10989] 수 정렬하기 3, https://www.acmicpc.net/problem/10989
  - 실행 시간: 2376ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
		    arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);   // 오름차순 정렬
		
		for (int i=0; i<n; i++) {
		    sb.append(arr[i]).append("\n"); //StringBuilder에 저장
		}
		
		System.out.print(sb);
	}
}
