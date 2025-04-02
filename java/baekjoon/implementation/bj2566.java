import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250402(수)
  - 2566번: 최댓값 (브론즈3), https://www.acmicpc.net/problem/2566
  - 실행 시간: 124ms
  - 1차: 틀림, 2차: 120ms, ✅3차: 124ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    // 입력값, 최댓값, 좌표
	    int num = 0, max = 0, x = 1, y = 1;  // x, y 초기값: 1 (모두 0인 경우 대비)
	    
	    // 배열에 값 삽입
	    for (int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; j++) {
                num = Integer.parseInt(st.nextToken());
	            if (max < num) {
	                max = num;    // 최댓값 찾기
	                
	                // 행, 열은 1부터 세기 때문에 +1
	                x = i+1;    
	                y = j+1;
	            }
            }
	    }
	    
	    System.out.println(max);
	    System.out.println(x + " " + y);
	}
}

/*
// 2차 풀이
public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    // 최댓값, 좌표
	    int max = 0, x = 1, y = 1;  // x, y 초기값: 1 (모두 0인 경우 대비)
	    int[][] arr = new int[9][9];    // 행렬 저장 위해 2차원 배열 생성
	    
	    // 배열에 값 삽입
	    for (int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
	    }

	    for (int i=0; i<9; i++) {
	        for (int j=0; j<9; j++) {
	            if (max < arr[i][j]) {
	                max = arr[i][j];    // 최댓값 찾기
	                
	                // 행, 열은 1부터 세기 때문에 +1
	                x = i+1;    
	                y = j+1;
	            }
	        }
	    }
	    
	    System.out.println(max);
	    System.out.println(x + " " + y);
	}
}
*/
