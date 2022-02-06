abstract class Print
{
       void text1()
		{
          System.out.println("first");
		}

abstract void text2();
abstract void text3();
abstract void text4();
abstract void text5();
}
class One extends Print
{
	void text2()
		{
		System.out.println("second");
	    }
void text3()
		{
			System.out.println("third");
		}
  void text4()
	{
		System.out.println("third");
	}
	void text5()
	{
		System.out.println("third");
	}
	public static void main(String[] args)
{
	Print p=new One();
	p.text1();
	p.text3();
	p.text2();
	p.text1();
	p.text4();
	p.text5();
}
}




