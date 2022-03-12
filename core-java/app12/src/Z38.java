class Z38 
{
	public static void main(String[] args) 
	{
		{
			int i = 10;
			System.out.println("block:" + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}


/*

it will give compile time error. becouse here, i has been used outside the block(last SOP).

*/