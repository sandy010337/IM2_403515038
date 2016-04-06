/*
 * [A]98
 * [TA's Advise]
 * 1.這次的作業要寫成兩個檔案, 之後請務必注意喔!
 * 2.Good JOB!
 * 3.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 4.下次可以在javadoc中寫一些註解!
 * */
class Easter {
	Easter() {
	}

	static String calculateEaster(int y) {
		int a = y % 19;
		int b = y % 4;
		int c = y % 7;
		int k = y / 100;// Math.floor(), -2
		int p = (13 + 8 * k) / 25;
		int q = k / 4;
		int m = (15 - p + k - q) % 30;
		int n = (4 + k - q) % 7;
		int d = (19 * a + m) % 30;
		int e = (2 * b + 4 * c + 6 * d + n) % 7;
		int day = 22 + d + e;
		int mon = 3;
		if (d == 29 && e == 6) {
			mon = 4;
			day = 19;
		}
		if (d == 28 && e == 6 && (11 * m + 11) % 30 < 19) {
			day = 18;
			mon = 4;
		}
		if (day > 31) {
			mon += 1;
			day -= 31;
		}
		return "In " + y + " , Easter Sunday is: month = " + mon + " and day = " + day;
	}
}

public class EasterTester {
	public static void main(String[] args) {
		String y1, y2;
		Easter a = new Easter();
		y1 = Easter.calculateEaster(2001);
		y2 = Easter.calculateEaster(2012);
		System.out.println(y1);
		System.out.println(y2);
	}
}