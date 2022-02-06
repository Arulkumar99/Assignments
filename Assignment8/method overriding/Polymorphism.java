 class Polymorphism {
	 void display()
	 {
		 System.out.println("********");
		 }

}
class Snow extends Polymorphism
{
	void display()
	{
		System.out.println("#############");
	}
public static void main(String[] args)
{
	Snow s=new Snow();
	s.display();
	
}
}