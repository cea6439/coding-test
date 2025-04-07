import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250407(월)
  - 10817번: 세 수 (브론즈3), https://www.acmicpc.net/problem/10817
  - 실행 시간: 108ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if ((a >= b && a <= c) || (a >= c && a <= b)) {
		    // a가 b보다 크거나 같고, c보다 작거나 같음 || a가 c보다 크거나 같고, b보다 작거나 같음
		    System.out.println(a);
		} else if ((b >= a && b <= c) || (b >= c && b <= a)) {
		    // b가 a보다 크거나 같고, c보다 작거나 같음 || b가 c보다 크거나 같고, a보다 작거나 같음
		    System.out.println(b);
		} else if ((c >= a && c <= b) || (c >= b && c <= a)) {
		    // c가 b보다 크거나 같고, b보다 작거나 같음 || c가 a보다 크거나 같고, b보다 작거나 같음
            System.out.println(c);
		}
	}
}
