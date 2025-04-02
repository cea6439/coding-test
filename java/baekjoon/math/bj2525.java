import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250402(수)
  - 2525번: 오븐 시계 (브론즈3), https://www.acmicpc.net/problem/2525
  - 실행 시간: 120ms
  - 1차: 틀림, 2차: 128ms, ✅3차: 120ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int c = Integer.parseInt(br.readLine());

    int m = a * 60 + b + c;  // 모두 분으로 바꿈
    int h = m / 60 % 24;    // 60 나눈 몫에서 24 나눈 나머지 값
    m %= 60;    // 나머지
		
		System.out.print(h + " " + m);
	}
}

/*
// 2차 풀이
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int c = Integer.parseInt(br.readLine());

        int h = a + c / 60;
        int m = b + c % 60;
        
        if (m >= 60) {
            h += m / 60;
            m = m % 60;
        }
        
        if (h >= 24) {
            int t = h / 24;
            h -= 24*t;
        }
		
		System.out.print(h + " " + m);
	}
}
*/
