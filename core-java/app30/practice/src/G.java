class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class G extends A
{
	G(int i)
	{
		System.out.println("G(int)");
	}
	public static void main(String[] args)
	{
		A a1 = new A(90);
		System.out.println("----------");
		G g1 = new G(90);
	}
}

/*

G.java:11: error: constructor A in class A cannot be applied to given types;
        {
        ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error


*/