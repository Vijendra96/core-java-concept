interface A
{
	void test();
}
class V implements A
{
	public void test()
	{
		System.out.println("A-test");
	}
	public static void main(String[] args) 
	{
		V v1 = new V();
		v1.test();
		System.out.println("done");
	}
}

/*

A-test
done

  
*/