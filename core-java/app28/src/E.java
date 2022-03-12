class E 
{
	int i;
	void test1()
	{
		System.out.println("from test-1 : " + i); //this.i
		i = 3;	//this.i = 3;
		test2(); //this.test2();
		System.out.println("from test-11 : " + i);//this.i
		i = 4;  //this.i = 4;
	}
		void test2()
		{
			System.out.println("from test-2 : " + i);
			i = 5; //this.i = 5;
		}

	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.i = 6;
		System.out.println("main - 1 : " + e1.i);
		e1.test1();
		System.out.println("main - 2 : " + e1.i);
		e1.i = 7;
		e1.test2();
		System.out.println("main - 2 : " + e1.i);
	}
}

/*
main - 1 : 6
from test-1 : 6
from test-2 : 3
from test-11 : 5
main - 2 : 4
from test-2 : 7
main - 2 : 5
*/