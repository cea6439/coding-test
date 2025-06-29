import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250626(목)
  - [백준/1546] 평균 (브론즈2), https://www.acmicpc.net/problem/1546
  - 실행 시간: 112ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double[] arr = new double[n];   // double 배열 선언
		double max = 0; // 최댓값
		double total = 0.0;   // 총점
		
		for (int i=0; i<n; i++) {
		    double score = Double.parseDouble(st.nextToken());
		    total += score; // 점수 합계 구하기
		    
		    if (max < score) {
		        max = score;   // 최댓값 구하기
		    }
		}
		
		System.out.print(total/max*100/n);    // 새로운 평균
	}
}
