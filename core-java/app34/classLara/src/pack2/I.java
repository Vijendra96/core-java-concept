package pack2;
class I 
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.j);
		System.out.println(g1.k);

		H h1 = new H();
		System.out.println(h1.j);
		System.out.println(h1.k);
	}
}


/*

pack2\I.java:7: error: j has protected access in A
                System.out.println(g1.j);
                                     ^
pack2\I.java:11: error: j has protected access in A
                System.out.println(h1.j);
                                     ^
2 errors

*/