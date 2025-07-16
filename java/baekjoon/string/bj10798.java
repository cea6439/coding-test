import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250716(수)
  - [백준/10798] 세로읽기(브론즈1), https://www.acmicpc.net/problem/10798
  - 실행 시간: 104ms
  - 1차: 틀림, ✅ 2차: 104ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] arr = new char[15][15];    // 2차원 배열 생성 (최대 15개 글자)
		
		for (int i=0; i<5; i++) {
		    char[] temp = br.readLine().toCharArray();  // String -> char[]
		    for (int j=0; j<temp.length; j++) {
	            arr[i][j] = temp[j];    // arr에 각각의 글자 저장
		    }
		}

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<5; j++) {
                if (arr[j][i] != 0) {  // null 체크
                    sb.append(arr[j][i]);   // 세로 글자 저장
                }
            }
        }
        
        System.out.print(sb);
	}
}
