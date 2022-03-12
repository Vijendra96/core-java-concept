class V 
{
	public static void main(String[] args) 
	{
		boolean marriedStatus = Boolean.parseBoolean(args[0]);
		if(marriedStatus)
		{
			System.out.println("yes... married");
		}
		if(!marriedStatus)
		{
			System.out.println("no... un-married");
		}

	}
}
