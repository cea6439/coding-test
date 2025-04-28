import java.io.*;
import java.lang.*;
import java.util.*;

/*
  - 문제 풀이: 250428(월)
  - 2577번: 숫자의 개수 (브론즈2), https://www.acmicpc.net/problem/2577
  - 실행 시간: 100ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String str = a * b * c + "";    // int -> String
		char[] chArr = str.toCharArray();   // String -> char
		int[] arr = new int[10];
		
		for (int i=0; i<chArr.length; i++) {
		    for (int j=0; j<=9; j++) {
		        if (chArr[i] - '0' == j) {  // char -> int 변환 후 0~9 비교
		            arr[j] += 1;    // 숫자 개수 카운트
		        }
		    }    
		}
		
		// 결과 출력
		for (int i=0; i<arr.length; i++) {
		    System.out.println(arr[i]);    
		}
	}
}
