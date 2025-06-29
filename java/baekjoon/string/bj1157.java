import java.io.*;

/*
  - 문제 풀이: 250624(화)
  - [백준/1157] 단어 공부 (브론즈2), https://www.acmicpc.net/problem/1157
  - 실행 시간: 1차 풀이: ❌, 2차 풀이: 296ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char[] arr = br.readLine().toCharArray(); // String -> char
	    int[] count = new int[91];  
        
        for (int i=0; i<arr.length; i++) {
            if ('a' <= arr[i]) {
                arr[i] -= 32;   // 소문자 -> 대문자
            }
            
            for (char j='A'; j<='Z'; j++) {
                if (arr[i] == j) {
                    count[j] += 1;  // 아스키 코드를 인덱스로 출현 개수 저장
                }
            }
        }	    
	    
	    int max = 0;    // 가장 많이 사용된 개수
	    int maxCount = 0;   // 가장 많이 사용된 알파벳 여러 개인 경우 > 0
	    int index = 0;  // 최댓값의 인덱스
	    
	    for (int i=0; i<count.length; i++) {
            if (max < count[i]) {
	            max = count[i];
	            maxCount = 0;
	            index = i;
	        } else if (max == count[i]) {  // 가장 많이 사용된 알파벳 여러 개 존재
	            maxCount++;
	        }
	    }
	    
	    if (maxCount == 0) {
	        System.out.print((char)index);  // int -> char 후 결과 출력    
	    } else {
	        System.out.print("?");
	    }
	}
}
