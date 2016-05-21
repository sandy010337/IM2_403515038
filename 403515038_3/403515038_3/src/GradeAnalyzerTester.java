/*
 * [A]93
 * [TA's Advise]
 * 1. 這次的作業應該是要求要分成兩個檔案寫喔. -5
 * 2. 為了你們的概念著想, 建議{}暫時都先不要省略, 像是if、for.
 * 3. Double跟double之間的差異可以想一下喔.
 * 4. 寫法沒什麼太大問題, 只是有些可以把它想得更簡單一些.
 * */

//This is a program to calculate average,standard deviation and the grade distribution  
import java.lang.Double;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class GradeAnalyzer {

	Double SD, average, sum;
	int a1 = 0, a = 0, a3 = 0, b1 = 0, b = 0, b3 = 0, c1 = 0, c = 0, c3 = 0, d = 0, f = 0, cnt = 0;

	GradeAnalyzer(double SD, double average, int cnt, int a1, int a, int a3, int b1, int b, int b3, int c1, int c,
			int c3, int d, int f) {
		this.SD = SD;
		this.average = average;
		this.cnt = cnt;
		this.a1 = a1;
		this.a = a;
		this.a3 = a3;
		this.b1 = b1;
		this.b = b;
		this.b3 = b3;
		this.c1 = b1;
		this.c = c;
		this.c3 = c3;
		this.d = d;
		this.f = f;
	}

	static Boolean isValidGrade(double Grade) {
		if (Grade >= 0 && Grade <= 110)
			return true;
		else
			return false;
	}

	void AnalyzeGrade(double Grade) {
		if (Grade >= 98)
			this.a1++;
		else if (Grade >= 92)
			this.a++;
		else if (Grade >= 90)
			this.a3++;
		else if (Grade >= 88)
			this.b1++;
		else if (Grade >= 82)
			this.b++;
		else if (Grade >= 80)
			this.b3++;
		else if (Grade >= 78)
			this.c1++;
		else if (Grade >= 72)
			this.c++;
		else if (Grade >= 70)
			this.c3++;
		else if (Grade >= 60)
			this.d++;
		else
			this.f++;
	}

	void addGrade(ArrayList<Double> Line, double sum) {
		this.cnt = Line.size();
		if (this.cnt < 2)
			System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades");
		else {
			this.average = sum / this.cnt;
			double tmp = 0.0;
			for (int i = 0; i < this.cnt; i++)
				tmp += Math.pow(Line.get(i) - this.average, 2); // It's the
																// sequence of
																// calculating
																// standard
																// deviation
			this.SD = Math.sqrt(tmp / this.cnt);

		}
	}

	public String toString() {
		if (this.cnt < 2)
			return "";
		else
			return "You entered " + this.cnt
					+ " valid grades from 0 to 110. Invalid grades are ignored!\n\nThe average = "
					+ Math.round(this.average) + " with a standard deviation = " + Math.round(this.SD) + "\n";
	}
}

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		double tempgrade = 0.0, SD = 0.0, average = 0.0, sum = 0.0;
		String Grade = new String();
		ArrayList<Double> Line = new ArrayList<Double>(); // ArrayList<> is to
															// create a
															// string,then it
															// need xx.add()
		int a1 = 0, a = 0, a3 = 0, b1 = 0, b = 0, b3 = 0, c1 = 0, c = 0, c3 = 0, d = 0, f = 0, cnt = 0;
		GradeAnalyzer project = new GradeAnalyzer(SD, average, cnt, a1, a, a3, b1, b, b3, c1, c, c3, d, f);

		// for(;;)寫while(true)會不會比較好懂呢?
		for (;;) {
			Grade = JOptionPane.showInputDialog(null, "Please keep entering the Grade", ""); // create
																								// the
																								// prompt
																								// window
			if (Grade.equalsIgnoreCase("q"))
				break; // equalsIgnoreCase will ignore whether upper or lower
						// case
			
			//建議成功加入之後再增加計數
			cnt++;
			
			//只要有使用者輸入都建議要有例外處理, -2
			tempgrade = Double.parseDouble(Grade); // parseDouble will get the
													// Double from String.
			if (GradeAnalyzer.isValidGrade(tempgrade)) { // Now I have a string
															// named Line
				sum += tempgrade;
				Line.add(tempgrade);
				project.AnalyzeGrade(tempgrade);
			}
		}
		project.addGrade(Line, sum);
		if (cnt < 2)
			;
		else {
			System.out.println(project.toString());
			System.out.println("The grade distribution is:\n");
			System.out.println("A+ = " + project.a1);
			System.out.println("A  = " + project.a);
			System.out.println("A- = " + project.a3);
			System.out.println("B+ = " + project.b1);
			System.out.println("B  = " + project.b);
			System.out.println("B- = " + project.b3);
			System.out.println("C+ = " + project.c1);
			System.out.println("C  = " + project.c);
			System.out.println("C- = " + project.c3);
			System.out.println("D  = " + project.d);
			System.out.println("F  = " + project.f);
		}
		for (int i = 0; i < Line.size(); i++)
			Line.remove(i);
	}
}
