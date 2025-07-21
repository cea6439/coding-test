import java.io.*;
import java.util.*;

/*
  - 문제 풀이: 250718(금)
  - [백준/1924] 2007년(브론즈1), https://www.acmicpc.net/problem/1924
  - 실행 시간: 112ms
*/
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		String[][] arr = new String[13][32];    // 월/일에 따른 요일 저장
		String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};   // 요일
		int count = 0;  // 요일 카운팅
		boolean flag = false;   // 이중반복문 탈출용
		
		for (int i=1; i<=12; i++) {
		    if (flag == true) {
		        break;  // 결과 찾으면 반복문 탈출
		    }
		    
		    if (i == 2) {
		        for (int j=1; j<=28; j++) {
		            arr[i][j] = day[count];
		            
		            if (i == x && j == y) {
		                flag = true;
		                break;
		            }
		            
		            if (count == 6) {
		                count = 0;
		            } else {
		                count++;
		            }
		        }
		    } else if (i == 4 || i == 6 || i == 9 || i == 11) {
		        for (int j=1; j<=30; j++) {
		            arr[i][j] = day[count];
		            		            
		            if (i == x && j == y) {
		                flag = true;
		                break;
		            }
		            
		            if (count == 6) {
		                count = 0;
		            } else {
		                count++;
		            }
		        }
		    } else {
		        for (int j=1; j<=31; j++) {
		            arr[i][j] = day[count];
		            		            
		            if (i == x && j == y) {
		                flag = true;
		                break;
		            }
		            
		            if (count == 6) {
		                count = 0;
		            } else {
		                count++;
		            }
		        }
		    } 
		}
		
		System.out.print(day[count]);
	}
}
