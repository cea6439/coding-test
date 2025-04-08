import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250408(화)
  - 2562번: 최댓값 (브론즈3), https://www.acmicpc.net/problem/10817
  - 실행 시간: 100ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = 0;
		int max = 0;
		int order = 0;
		
		for (int i=0; i<9; i++) {
		    n = Integer.parseInt(br.readLine());
		    
		    // 최댓값, 순서 찾기
		    if (max < n) {
		        max = n;
		        order = i;
		    }
		}
		
		System.out.println(max);
		System.out.println(order + 1);
	}
}
