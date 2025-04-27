import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250427(일)
  - 2750번: 수 정렬하기 (브론즈2), https://www.acmicpc.net/problem/2750
  - 실행 시간: 136ms
*/
public class Main {
  	public static void main(String[] args) throws IOException {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    		
    		int n = Integer.parseInt(br.readLine());
    		
    		int[] arr = new int[n];
    		for (int i=0; i<n; i++) {
    		    arr[i] = Integer.parseInt(br.readLine());
    		}
    		
    		Arrays.sort(arr);   // 오름차순 정렬
    		
    		for (int i=0; i<n; i++) {
    		    bw.write(arr[i] + "\n");
    		}
    		
    		bw.flush();
    		bw.close();
  	}
}
