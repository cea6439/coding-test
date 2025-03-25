import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250325(화)
  - 2739번: 구구단 (브론즈5), https://www.acmicpc.net/problem/2739
  - 실행 시간: 104ms
*/
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i<=9; i++) {
		    int r = n * i;
		    sb.append(n).append(" * ").append(i).append(" = ").append(r);
		    System.out.println(sb);
		    
		    // StringBuilder 초기화
		    sb.setLength(0);
		}
	}
}
