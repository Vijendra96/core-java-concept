import java.util.ArrayList;
class Z12 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		ArrayList d1 = test();
		System.out.println("main end : " + d1);
	}
	static ArrayList test()
	{
		System.out.println("I am from test");
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add(90);
		list.add("xyz");
		return list;
	}
}

/*

main begin
I am from test
main end : [90, abc, 90, xyz]


*/