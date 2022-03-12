class R 
{
	public static void main(String[] args) 
	{
		int i = 600; int j = 400 ; int k=500;
		
		System.out.println(i);	//600
		System.out.println(j);	//400
		System.out.println(k);	//500
		i = j = k = 200;
		System.out.println(i);	//200
		System.out.println(j);	//200
		System.out.println(k);	//200
	}
}
