

public class RectangleTester
{
	public static void main(String[] args)
	{
		Rectangle rectangle1=new Rectangle(15,25,57,18);
		Rectangle rectangle2=new Rectangle(0,12,60,47);
		double width1=rectangle1.getWidth();
		double width2=rectangle2.getWidth();
		double height1=rectangle1.getHeight();
		double height2=rectangle2.getHeight();
		
		System.out.println(rectangle1.toString());
		System.out.println("Area ="+width1*height1);
		System.out.println("Rerimeter ="+(width1+height1)*2.0);
		System.out.println();
		System.out.println(rectangle2.toString());
		System.out.println("Area ="+width2*height2);
		System.out.println("Rerimeter ="+(width2+height2)*2.0);
		System.out.println();
		System.out.println("End of Output!");
	}
}
