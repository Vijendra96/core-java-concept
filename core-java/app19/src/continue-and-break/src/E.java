class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("body with begin with " + i);
			if(i == 4)
			{
				break; //loop getting terminated
			}
			System.out.println("body end with " + i);
		}
		System.out.println("main end");
	}
}


/*

in java, there is a four keyword that should be the last statement in the currunt block;

1.	continue
2.	break
3.	throw
4.	return

*/