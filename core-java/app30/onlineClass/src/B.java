class A
{
	int i;
}
class B extends A
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i + ", " + b1.j);
	}
}
/*
0, 0
*/

/*
B ===> subclass
A ===> superclass

memeber of A inheritening to B.
*/