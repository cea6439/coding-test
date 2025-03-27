import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250327(목)
  - 15552번: 빠른 A+B (브론즈4), https://www.acmicpc.net/problem/15552
  - 실행 시간: 740ms
  - 1차: 시간초과, 2차: 시간초과, 3차: 790ms, 4차: 740ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 출력 문자열을 저장할 버퍼

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			sb.append(a + b).append('\n'); // 개행 미리 추가
		}

		System.out.print(sb); // 한 번에 출력
	}
}
