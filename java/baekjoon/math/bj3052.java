import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250325(화)
  - 3052번: 나머지 (브론즈2), https://www.acmicpc.net/problem/3052
  - 1차 풀이: 실패, 2차 풀이: 성공
  - 실행 시간: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Set 생성 (중복 X)
        Set<Integer> set = new HashSet<>();
        
        // n을 42로 나눈 후 나머지를 Set에 추가
        for (int i=0; i<10; i++) {
            int n = Integer.parseInt(br.readLine());
            set.add(n % 42);
        }
        
        // 결과 출력
        System.out.println(set.size());
	}
}
