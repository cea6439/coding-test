import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		// n번 반복
		for (int i=0; i<n; i++) {
		    String line = br.readLine();
		    int idx = line.indexOf(" ");    // 첫 번째 공백의 인덱스 위치
		    int a = Integer.parseInt(line.substring(0, idx));   // 0부터 공백 전까지 자름
		    int b = Integer.parseInt(line.substring(idx+1));    // 공백 다음부터 끝까지 자름
		    
		    // 영수증 총 금액에서 (구매 물건 가격 * 개수) 뺌
		    x -= a * b;
		}
		
		// x가 0이면 영수증 총 금액과 직접 계산한 총 금액이 같음
		System.out.println(x == 0 ? "Yes" : "No");
	}
}
