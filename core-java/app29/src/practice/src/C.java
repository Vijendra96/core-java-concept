class C 
{
	int i = 20;
	C()
	{
		System.out.println("C():"+ i);
		i += 10; // this.i += 10;
	}
	public static void main(String[] args)
	{
		C ref = new C();
		System.out.println("main:" + ref.i);
	}
}
/*
C(): 20
main: 30
*/
