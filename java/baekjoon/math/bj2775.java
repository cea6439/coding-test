import java.io.*;

/*
  - 문제 풀이: 250714(월)
  - [백준/2775] 부녀회장이 될테야(브론즈1), https://www.acmicpc.net/problem/2775
  - 실행 시간: 120ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스 개수 입력
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
		    // 층수 입력 (k층)
		    int k = Integer.parseInt(br.readLine());
		    // 호수 입력 (n호)
		    int n = Integer.parseInt(br.readLine());
		    
		    // 아파트 사람 수를 저장할 2차원 배열 선언 (0층부터 k층까지, 1호부터 n호까지)
		    int arr[][] = new int[k + 1][n + 1];
		    
		    // 0층 j호에는 j명이 거주
		    for (int j = 1; j <= n; j++) {
		        arr[0][j] = j;
		    }
		    
		    // 1층부터 k층까지 사람 수 채우기
		    for (int j = 1; j <= k; j++) {
		        arr[j][1] = 1;  // 각 층의 1호에는 항상 1명 거주
		        for (int h = 2; h <= n; h++) {
		            // 점화식: arr[j][h] = arr[j][h-1] + arr[j-1][h]
		            // 현재 층의 h호 = 현재 층 (j층)의 h-1호 + 아래층 (j-1층)의 h호 사람 수
		            arr[j][h] = arr[j][h - 1] + arr[j - 1][h];
		        }
		    }
		    
		    // 결과 저장 (k층 n호의 사람 수)
		    sb.append(arr[k][n]).append("\n");
		}
		
		// 최종 결과 한 번에 출력
		System.out.print(sb);
	}
}
