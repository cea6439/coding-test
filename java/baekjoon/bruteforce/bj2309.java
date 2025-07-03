import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250703(목)
  - [백준/2309] 일곱 난쟁이(브론즈1), https://www.acmicpc.net/problem/2309
  - 실행 시간: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[9]; // 아홉 난쟁이 저장
		int sum = 0;    // 키의 합
		
		for(int i=0; i<9; i++) {
		    arr[i] = Integer.parseInt(br.readLine());
		    sum += arr[i];  // 키의 합 구하기
		}
		
		Arrays.sort(arr);   // 오름차순 정렬
		
		int minus = sum - 100;  // 합에서 100을 빼서 차이 구함
		
		for (int i=8; i>0; i--) {
		    for (int j=0; j<9; j++) {
		        if (arr[i] + arr[j] == minus) { // 더했을 때 차이의 값과 같은 배열 값 삭제
		            arr[i] = 0; 
		            arr[j] = 0;
		            break;  // 배열 탈출
		        }
		    }
		    
		    if (arr[i] == 0) {
		        break;  // 배열 탈출
		    }
		}
		
		// 삭제된 값 제외 나머지 값 출력
		for (int i=0; i<9; i++) {
		    if (arr[i] != 0) {
		        sb.append(arr[i]).append("\n");
		    }
		}
		
		System.out.print(sb);
	}
}
