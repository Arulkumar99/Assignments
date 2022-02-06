 class Overloading 
 {
void display()
{
	
 System.out.println("java is programming language");
}
}
 class Winter extends Overloading
 {
	 void display(String a) 
	 {
	     a="common english language";
		 System.out.println(a);
	 }
 public static void main(String[] args)
 {
	 Winter w=new Winter();
	 w.display();
	 w.display("hello");
 }
 }
