import java.io.*;
import java.lang.*;
import java.util.*;

/*
  - 문제 풀이: 250410(목)
  - 2738번: 행렬 덧셈 (브론즈3), https://www.acmicpc.net/problem/2738
  - 실행 시간: 144ms
  - 1차: 152ms, ✅2차: 144ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 2개의 행렬 저장할 2개의 2차원 배열
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		StringBuilder sb = new StringBuilder();  // 마지막 행렬 출력을 위한 StringBuilder
		
		// 1번 행렬 저장
		for (int i=0; i<n; i++) {
		    st = new StringTokenizer(br.readLine());
		    for (int j=0; j<m; j++) {
		        arr1[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		
		// 2번 행렬 저장
		for (int i=0; i<n; i++) {
		    st = new StringTokenizer(br.readLine());
		    for (int j=0; j<m; j++) {
		        arr2[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		
		// 행렬 덧셈 결과를 StringBuilder에 저장
		for (int i=0; i<n; i++) {
		    for (int j=0; j<m; j++) {
		        sb.append(arr1[i][j] + arr2[i][j]).append(" ");
		    }
		    sb.append("\n");    // 줄바꿈
		}
		
		System.out.println(sb);
	}
}
