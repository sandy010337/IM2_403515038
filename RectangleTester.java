/*
 *[A]100
 *[TA's advise]
 *1.作業希望你們能寫成一個檔案, 已經將你的資料作合併囉.
 *2.Rectangle裡的properties宣告為Integer沒什麼太大問題, 但如果今天是提供給使用這輸入的話, 浮點數的部分就要加入考慮.
 *3.getHeight與getWidth中的this.width和height資料型態為Integer但回傳要為double這件事情有些詭譎, 但不能說是錯誤.
 *4.寫的很好.
 * */

class Rectangle {
	int x, y, width, height;

	Rectangle() {
	}

	Rectangle(int _x, int _y, int _width, int _height) {
		this.x = _x;
		this.y = _y;
		this.width = _width;
		this.height = _height;
	}

	double getWidth() {
		return this.width;
	}

	double getHeight() {
		return this.height;
	}

	public String toString() {
		return "java.Rectangle[x=" + this.x + ",y=" + this.y + ",width=" + this.width + ",height=" + this.height + "]";
	}
}

public class RectangleTester {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(15, 25, 57, 18);
		Rectangle rectangle2 = new Rectangle(0, 12, 60, 47);
		double width1 = rectangle1.getWidth();
		double width2 = rectangle2.getWidth();
		double height1 = rectangle1.getHeight();
		double height2 = rectangle2.getHeight();

		System.out.println(rectangle1.toString());
		System.out.println("Area =" + width1 * height1);
		System.out.println("Rerimeter =" + (width1 + height1) * 2.0);
		System.out.println();
		System.out.println(rectangle2.toString());
		System.out.println("Area =" + width2 * height2);
		System.out.println("Rerimeter =" + (width2 + height2) * 2.0);
		System.out.println();
		System.out.println("End of Output!");
	}
}
