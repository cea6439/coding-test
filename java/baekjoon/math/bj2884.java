import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250409(수)
  - 2884번: 알람 시계 (브론즈3), https://www.acmicpc.net/problem/2884
  - 실행 시간: 132ms
  - 1차: 틀림, ✅2차: 132ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// h, m을 하나의 분으로 바꾼 뒤 45를 뺌
		int result = h * 60 + m - 45;
		
		if (result < 0) {
		    // result가 음수인 경우
		    h = 23;
		    m = 60 + result;
		} else {
		    // result가 양수인 경우
		    h = result / 60;
		    m = result % 60;
		}
		
		System.out.println(h + " " + m);
	}
}
