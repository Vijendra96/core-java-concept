class B 
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
		B b1 = new B();
		System.out.println("from main : " + b1);
		b1.i = 10;
		System.out.println("from main1 : " + b1.i);
		b1.test();
		System.out.println("from main2 : " + b1.i);
	}
}
/*
from main : B@452b3a41
from main1 : 10
from test : B@452b3a41
from test : 10
from main2 : 20

*/