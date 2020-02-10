//5789. 현주의 상자 바꾸기 
//정답이 왜 아닌지 이해불가,,,

package taeyoung;

import java.util.Scanner;

public class solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1005];
		int testcase;
		testcase = sc.nextInt();
		
		for(int tc = 0; tc < testcase; tc++) {
			int N, Q;
			N = sc.nextInt(); // N 배열
			Q = sc.nextInt(); // Q회 동안
			
			for(int i = 0; i < 1005; i++) {
				arr[i] = 0;
			}
			
			for(int tc2 = 0; tc2 < Q; tc2++) {
				int L, R;
				L = sc.nextInt(); // L ~ R 상자를 i 로 변경
				R = sc.nextInt();
				
				for(int i = L; i < R+1; i++) {
					arr[i] = tc2 + 1;
				}
			}
			
			System.out.print("#" + (tc + 1));
			for(int i = 0; i < N; i++) {
				System.out.print(" " + arr[i]);
			}
			System.out.println("");
		}
		
	}
}
