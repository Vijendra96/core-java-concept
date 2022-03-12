class J
{
	static int count;
	J()
	{
		count ++;
		//System.out.println(count);
	}
	J(int i)
	{
		count ++;
		//System.out.println(count);
	}
	public static void main(String[] args)
	{
		J obj1 = new J();
		J obj2 = new J();//2
		J obj3 = new J(20);//3
		J obj4 = new J();//4
		J obj5 = new J(40);//5
		System.out.println(count);//5
	}
}
/*
5
*/