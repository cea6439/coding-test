import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250330(일)
  - 10039번: 평균 점수 (브론즈4), https://www.acmicpc.net/problem/10039
  - 실행 시간: 108ms
*/
public class Main {
  	public static void main(String[] args) throws IOException {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		
    		int total = 0;
    		
    		for (int i=0; i<5; i++) {
          int s = Integer.parseInt(br.readLine());
    
          if (s < 40) {
              s = 40; // 40점 미만은 40점으로 고정
          }
    
          total += s;    // 모든 점수 더하기
    		}
    		
    		System.out.println(total/5);
    }
}

/*
// 2차 풀이
public class Main {
  	public static void main(String[] args) throws IOException {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		
    		int total = 0;
    		
    		for (int i=0; i<5; i++) {
            int s = Integer.parseInt(br.readLine());
            total += Math.max(40, s);
    		}
    		
    		System.out.println(total/5);
  	}
}
*/
