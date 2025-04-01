import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250401(화)
  - 2588번: 곱셈 (브론즈3), https://www.acmicpc.net/problem/2588
  - 실행 시간: 100ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();   // 문자열 분리할 예정이기에 형 변환 X
		
		String[] arr = b.split(""); // 한 글자씩 분리
		
		for (int i=2; i>=0; i--) {
		    int result = a * Integer.parseInt(arr[i]);  // a * 각각의 b 숫자
		    System.out.println(result);
		}
		
		// a*b
		System.out.println(a * Integer.parseInt(b));
	}
}
