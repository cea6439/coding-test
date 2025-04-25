import java.io.*;
import java.lang.*;
import java.util.*;

/*
  - 문제 풀이: 250425(금)
  - 8958번: OX퀴즈 (브론즈2), https://www.acmicpc.net/problem/8958
  - 실행 시간: 108ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
		    String str = br.readLine();
		    char[] chars = str.toCharArray();
		    
		    int result = 0;
		    int oCount = 0; // O 개수 (새로운 테스트 케이스마다 초기화)
		    for (int j=0; j<chars.length; j++) {
		        if (chars[j] == 'X') {
		            oCount = 0; // X면 O 개수 초기화
		        } else if (chars[j] == 'O') {
		            oCount++;
		            result += oCount;
		        }
		    }
		    System.out.println(result);
		}
	}
}
