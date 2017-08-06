package cn.itcast.xuesheng;

import java.util.Scanner;


	class Student1 {
		String name, number;
		float p;
		int score1, score2, score3, score4, score5, score6, score7, score8,
				score9, score10;

		Student1() {
		}

		Student1(String n, String num, int s1, int s2, int s3, int s4, int s5,
				int s6, int s7, int s8, int s9, int s10) {
			name = n;
			number = num;
			score1 = s1;
			score2 = s2;
			score3 = s3;
			score4 = s4;
			score5 = s5;
			score6 = s6;
			score7 = s7;
			score8 = s8;
			score9 = s9;
			score10 = s10;
		}

		public float Count() {
			p = score1 + score2 + score3 + score4 + score5 + score6 + score7
					+ score8 + score9 + score10;
			return p;
		}

		public float Aver() {
			return p / 10;
		}
	}
public class Student {
	public static void main(String[] args) {
		Student1 student;
		float sum, ave;
		Scanner r = new Scanner(System.in);
		student = new Student1(r.next(), r.next(), r.nextInt(), r.nextInt(),
				r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt(),
				r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
		sum = student.Count();
		System.out.println("总成绩为" + sum);
		ave = student.Aver();
		System.out.println("平均成绩为" + ave);
	}

}
