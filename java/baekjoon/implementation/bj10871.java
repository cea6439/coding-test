import java.util.*;
import java.lang.*;
import java.io.*;

/*
  - 문제 풀이: 250323(일)
  - 10871번: X보다 작은 수 (브론즈5), https://www.acmicpc.net/problem/10807
  - 실행 시간: 148ms
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 모음용
        
        // 문자열을 구분자로 분리하여 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        // 다음 행에 있는 입력값 받기
        st = new StringTokenizer(br.readLine());
        
        // n 크기의 배열 생성
        int[] arr = new int[n];
        
        // int로 형 변환
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // StringBuilder에 문자열 추가
        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                sb.append(arr[i]).append(" ");  // 출력 시 공백 구분자
            }
        }
        
        // 결과: x보다 작은 수 출력
        System.out.println(sb);
    }
}
