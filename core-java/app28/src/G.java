class G
{
	int i;
	void test()
	{
		System.out.println("from test:"+ i); //
		System.out.println("from test:"+ this.i);
		i = 10; // this.i = 10
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		G ref = new G();
		ref.i = 5;
		System.out.println("main1:" + ref.i);
		ref.test();
		System.out.println("main2:" + ref.i);
		System.out.println("main end");
	}
}
/*
main begin
main1:5
from test:5
from test:5
main2:10
main end
*/