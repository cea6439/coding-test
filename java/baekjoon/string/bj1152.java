import java.io.*;
import java.lang.*;
import java.util.*;

/*
  - 문제 풀이: 250421(월)
  - 1152번: 단어의 개수 (브론즈2), https://www.acmicpc.net/problem/1152
  - 실행 시간: 1차 풀이: 292ms ✅, 다른 풀이: 244ms
*/
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int count = 0;  // 단어 개수
    
    while (st.hasMoreTokens()) {
        String word = st.nextToken();   // StringTokenizer에서 토큰 꺼내기
        count++;    // 토큰 개수++
    }
    
    System.out.println(count);
  }
}

/*
// 다른 풀이
import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    System.out.println(st.countTokens());   // 토큰 개수 출력
	}
}
*/
