class F 
{
	int i;
	F(int i)
	{
		System.out.println("from constructor");
		this.i = i;
		
	}
	public static void main(String[] args) 
	{
		F obj1 = new F(10);
		System.out.println("-----------");
		F obj2 = new F(20);
		System.out.println("-----------");
		F obj3 = new F(30);
		System.out.println("-----------");
		F obj4 = new F(40);
		System.out.println("-----------");
		System.out.println(obj1.i + ", " + obj2.i + ", " + obj3.i + ", " + obj4.i);
	}
}
/*
from constructor
-----------
from constructor
-----------
from constructor
-----------
from constructor
-----------
10, 20, 30, 40
*/