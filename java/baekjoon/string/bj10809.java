import java.io.*;
import java.lang.*;
import java.util.*;

/*
  - 문제 풀이: 250423(수)
  - 10809번: 알파벳 찾기 (브론즈2), https://www.acmicpc.net/problem/10809
  - 실행 시간: 104ms
  - *다른 풀이: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		char[] chArr = s.toCharArray(); // String -> char
		
		String[] strArr = new String[chArr.length]; // 분리한 char를 String으로 변환
		for (int i=0; i<chArr.length; i++) {
		    strArr[i] = Character.toString(chArr[i]);
		}
		
		String[] alpArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int[] intArr = new int[alpArr.length];  // 결과 출력을 위한 배열
		for (int i=0; i<alpArr.length; i++) {
		    intArr[i] = -1; // 기본값: -1
		}
		
		for (int i=0; i<alpArr.length; i++) {
		    for (int j=0; j<strArr.length; j++) {
		        if (alpArr[i].equals(strArr[j])) {  // 문자열 비교
		            intArr[i] = j;
		            break;  // 중복된 문자가 있는 경우 처음 나온 위치 저장
		        } 
		    }
		    sb.append(intArr[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}

/*
// 다른 풀이
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		for (int i='a'; i<='z'; i++) {
		    char ch = (char)i;
		    sb.append(s.indexOf(i)).append(" ");
		}
		
        System.out.print(sb);
	}
}
*/
