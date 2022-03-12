class D 
{
	public static void main(String[] args) 
	{
		String[] strs = {"abc", "test", "xyz" , "hello"};
		String s1;
		for(s1 : strs)
		{
		System.out.println(s1);
		}
	}
}


/* 
it will give a compile time error becouse we can initialize the variable out side the for loop head.
we need to initialize the variable inside the for loop head.
*/