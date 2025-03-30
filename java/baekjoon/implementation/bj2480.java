import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250330(일)
  - 2480번: 주사위 세개 (브론즈4), https://www.acmicpc.net/problem/2480
  - 실행 시간: 108ms
  - 1차: 104ms, 2차: 108ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int a = Integer.parseInt(st.nextToken()); 
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      
      int reward = 0;
      
      if (a == b && a == c) {
          reward = 10000 + a * 1000;
      } else if (a == b || a == c) {
          reward = 1000 + a * 100;
      } else if (b == c) {
          reward = 1000 + b * 100;
      } else {
          reward = Math.max(Math.max(a, b), c) * 100;
      }
      
      System.out.println(reward);
	}
}

// 1차 풀이
/*
public class Main {
	public static void main(String[] args) throws IOException {
  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  		StringTokenizer st = new StringTokenizer(br.readLine());
  		
      int a = Integer.parseInt(st.nextToken()); 
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
  
      int count = 1;  // 초기값 1 (모두 다른 눈)
      int n = 0;
      int reward = 0;
  
      if (a == b && a == c) {
          count = 3;  // 같은 눈 3개
      } else if (a == b || a == c) {
          count = 2;  // 같은 눈 2개
          n = a;
      } else if (b == c) {
          count = 2;  // 같은 눈 2개
          n = b;
      }
  
      if (count == 3) {
          reward = 10000 + n * 1000;
      } else if (count == 2) {
          reward = 1000 + n * 100;
      }  else if (count == 1) {
          int max = Math.max(Math.max(a, b), c);  // 최대값
          reward = max * 100;
      }
  
      System.out.println(reward);
 	}
}
*/
