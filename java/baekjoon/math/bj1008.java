import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250324(월)
  - 1008번: A/B (브론즈5), https://www.acmicpc.net/problem/1008
  - 실행 시간: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

    // 오차 범위를 벗어나지 않게 하기 위해 double형으로 변환 후 계산
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
    // a/b
    System.out.println(a/b);
	}
}
