class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(i++ == 0 && i++ == 0) //false
		// 0           1
		{
			System.out.println("if body : " + i++);
		}
		else if(i++ == 2) //true
			//  2
		{
			System.out.println("else body : " + i++); //3
			i++; //4
		}
		System.out.println("main end  : " + i); //i = 5
	}
}
