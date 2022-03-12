class C 
{
	int i;
	void test()
	{
		System.out.println("from test : " + this);
		System.out.println("from test : " + this.i);
		this.i = 20;
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		C c2 = new C();
		System.out.println("from main : " + c1);
		c1.i = 10;
		System.out.println("from main-1 : " + c1.i);
		c1.test();
		System.out.println("from main-2 : " + c1.i);
		System.out.println("from main : " + c2);
		c2.i = 40;
		System.out.println("from main-3 : " + c2.i);
		c2.test();
		System.out.println("from main-4 : " + c2.i);
	}
}

/*
from main : C@452b3a41
from main-1 : 10
from test : C@452b3a41
from test : 10
from main-2 : 20
from main : C@65b54208
from main-3 : 40
from test : C@65b54208
from test : 40
from main-4 : 20
*/