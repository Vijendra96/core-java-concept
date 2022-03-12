class G
{
	private int i;
}
class H extends G
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.i);
	}
}

/*

H.java:10: error: i has private access in G
                System.out.println(g1.i);
                                     ^
1 error

*/