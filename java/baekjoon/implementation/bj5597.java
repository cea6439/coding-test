import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250331(월)
  - 5597번: 과제 안 내신 분..? (브론즈3), https://www.acmicpc.net/problem/5597
  - 실행 시간: 100ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 인덱스 1부터 값 30개 저장
		int[] arr = new int[31];
		
		// 28번 반복
		for (int i=1; i<=28; i++) {
		    int n = Integer.parseInt(br.readLine());
		    arr[n] = n; // 인덱스 = 출석번호
		}
		
		// 1~30번까지 순회
		for (int i=1; i<=30; i++) {
		    // 값이 0인 경우 입력값에 없는 출석번호
		    if (arr[i] == 0) {
		        System.out.println(i);
		    }
		}
	}
}
