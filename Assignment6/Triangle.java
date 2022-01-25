
public class Triangle {
	void area()
	{
		int h=10,b=4;
		int area=h*b/2;
		System.out.println("the area triangke is :"+area);
		}
	void perimeter()
	{
		int a=3,b=4,c=5;
		int perimeter=a*b*c;
		System.out.println("the perimeter of the triangle is:"+perimeter);
	}
	public static void main(String args[])
	{
		Triangle obj=new Triangle();
		obj.area();
		obj.perimeter();
	}

}
