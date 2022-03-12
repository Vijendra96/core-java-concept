package practicePackage;
class A
{
	private int i;
}
class G extends A
{
	public static void main(String[] args)
	{
		G g1 = new G();
		System.out.println(g1.i);
	}
}


/*
private members of super class not inheriting to
subclass
*/






/*
practicePackage\G.java:11: error: i has private access in A
                System.out.println(g1.i);
                                     ^
1 error
*/