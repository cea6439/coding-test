import java.io.*;
import java.lang.*;
import java.util.*;

/*
  - 문제 풀이: 250424(목)
  - 1978번: 소수 찾기 (브론즈2), https://www.acmicpc.net/problem/1978
  - 실행 시간: 1차 풀이: 108ms, 2차 풀이: 104ms, 3차 풀이: 100ms ✅
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		int count = 0;
		
		for (int i=0; i<n; i++) {
		    arr[i] = Integer.parseInt(st.nextToken());  // 배열에 자연수 저장
		}
		
		for (int a : arr) {
		    for (int j=2; j<=a; j++) { // 2부터 시작
		        if (a != j && a%j == 0) {
		            break;  // 자기 자신이 아닌 약수가 있는 경우 반복문 탈출
		        } else if (a == j) {
		            count++;
		        }
		    }
		}
		
		System.out.print(count);
	}
}
