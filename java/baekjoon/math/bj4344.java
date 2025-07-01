import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250701(화)
  - [백준/4344] 평균은 넘겠지, https://www.acmicpc.net/problem/4344
  - 실행 시간: 140ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int c = Integer.parseInt(br.readLine());    // 테스트 케이스 개수
		
		for (int i=0; i<c; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    int n = Integer.parseInt(st.nextToken());
		    int[] arr = new int[n];
		    int average = 0;
		    double count = 0.0; // 평균 넘은 점수 개수
		    
		    for (int j=0; j<n; j++) {
		        arr[j] = Integer.parseInt(st.nextToken());  // 배열에 점수 저장
		        average += arr[j];
		        
		        if (j == n-1) {
		            average /= n;   // 마지막 인덱스에서 평균 구하기 완료
		        }
		    }
		    
		    for (int j=0; j<n; j++) {
		        if (arr[j] > average) {
		            count++;    // 평균 넘는 점수 개수++
		        }
		    }
		    
		    System.out.println(sb.append(String.format("%.3f", count*100/n)).append("%"));  // 비율 소수점 셋째 자리까지 출력
		    
		    sb.setLength(0);  // StringBuilber 초기화
		}
	}
}
