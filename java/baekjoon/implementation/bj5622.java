import java.util.*;
import java.io.*;
import java.lang.*;

/*
  - 문제 풀이: 250614(토)
  - 다이얼 (브론즈2), https://www.acmicpc.net/problem/5622
  - 실행 시간: 1차 풀이: 100ms, 2차 풀이: 96ms ✅
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		char[] chArr = word.toCharArray();  // String -> char
		
		int time = 0;   // *최소 시간
		
        	// 모든 다이얼 경우의 수
		for (int i=0; i<chArr.length; i++) {
		    if (chArr[i] <= 67) {
		        time += 3;
		    } else if (chArr[i] <= 70) {
		        time += 4;
		    } else if (chArr[i] <= 73) {
		        time += 5;
		    } else if (chArr[i] <= 76) {
		        time += 6;
		    } else if (chArr[i] <= 79) {
		        time += 7;
		    } else if (chArr[i] <= 83) {
		        time += 8;
		    } else if (chArr[i] <= 86) {
		        time += 9;
		    } else {
		        time += 10;
		    }
		}
		
		System.out.println(time);
	}
}
