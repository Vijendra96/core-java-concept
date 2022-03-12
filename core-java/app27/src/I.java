//pass by reference

class I 
{
	int a;
	static void test(I obj)//
	{
		System.out.println("test : " + obj.a);
		a = 20;
	}
	public static void main(String[] args) 
	{
		I ref = new I();
		ref.a = 10;
		System.out.println("main 1 : " + ref.a);
		test(ref);
		System.out.println("main 2 : " + ref.a);
	}
}


/*

main 1 : 10
test : 10
main 2 : 20

*/