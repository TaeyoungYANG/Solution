package taeyoung;

import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String score[] = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
		double[] stu_score = new double[105];
		
		int testcase = sc.nextInt();
		
		for(int tc = 0; tc < testcase; tc++){
			int N = sc.nextInt(); // 학생수
			int K = sc.nextInt(); // 알고자 하는 학생 번호
			int stu_num = 0;
			
			for(int i = 0; i < stu_score.length; i++){
				stu_score[i] = 0.0;
			} // 초기화
			
			for(int i = 0; i< N; i++) {
				double middle_exam = sc.nextDouble();
				double final_exam = sc.nextDouble();
				double sub = sc.nextDouble();
				
				stu_score[stu_num] = middle_exam * 0.35
				+ final_exam * 0.45
				+ sub * 0.2;
				
				stu_num++;
			}
			
			int rank = 0;
			int same_rank;
			
			same_rank = N / 10;
			
			for(int i = 0; i < N; i++){
				if(stu_score[K-1] < stu_score[i]) {
					rank++;
				}
			}
			
			int ans;
			ans = rank / same_rank;
			
			System.out.println("#" + (tc+1) + " " + score[ans]);
		}
	}
}