import java.util.*;
import java.lang.*;
import java.io.*;

/*
  문제 풀이: 250323(일)
  10807번: 개수 세기 (브론즈5), https://www.acmicpc.net/problem/10807
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String strNum = br.readLine();
        int v = Integer.parseInt(br.readLine());
                
        // 숫자 개수 카운트
        int count = 0;
        
        // StringTokenizer (split보다 빠름)
        StringTokenizer st = new StringTokenizer(strNum, " ");
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) == v) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
}
