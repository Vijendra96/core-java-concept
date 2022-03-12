class S 
{
	public static void main(String[] args) 
	{	
		int i = 0;
		int j = i++;       // 0
		System.out.println(i); //1 
		System.out.println(j); //0
		int m = 0;
		m = m++; //0
		System.out.println(m); //0
	}
}
