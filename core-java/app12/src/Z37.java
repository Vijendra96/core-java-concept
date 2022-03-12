class Z37 
{
	public static void main(String[] args) 
	{
		{
			System.out.println("block1");  //block1
			System.out.println("block1");  //block1
		}
		{
			System.out.println("block2");  //block2
			System.out.println("block2");  //block2
		}
			System.out.println("middle");  //middle
		{
			System.out.println("block3");  //block3
			System.out.println("block3");  //block3
			System.out.println("block3");  //block3
			System.out.println("block3");  //block3
		}
			System.out.println("end");     //end
	}
}
