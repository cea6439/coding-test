import java.io.*;
import java.lang.*;
import java.util.*;

/*
  - 문제 풀이: 250422(화)
  - 2675번: 문자열 반복 (브론즈2), https://www.acmicpc.net/problem/2675
  - 실행 시간: 1차 풀이: 96ms ✅, 2차 풀이: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int r = Integer.parseInt(st.nextToken());
		    String s = st.nextToken();
		    
		    char[] chars = s.toCharArray(); // 각각의 문자열 분리
		    
		    for (int j=0; j<chars.length; j++) {
		        for (int h=0; h<r; h++) {   // r번 반복
		            sb.append(chars[j]);    // StringBuilder에 저장
		        }
		    }
		    
		    sb.append("\n");    // 줄바꿈
		}
		
		System.out.println(sb);
	}
}

/*
// 2차 풀이
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int r = Integer.parseInt(st.nextToken());
		    String s = st.nextToken();
		    
		    for (int j=0; j<s.length(); j++) {
		        for (int k=0; k<r; k++) {   // r번 반복
		            sb.append(s.charAt(j));    // StringBuilder에 저장
		        }
		    }
		    
		    sb.append("\n");    // 줄바꿈
		}
		
		System.out.println(sb);
	}
}
*/
