class P 
{
	static 
    {
       System.out.println("P-SIB");
    }
}
class Q extends P
{
	static 
    {
       System.out.println("Q-SIB");
    }
    public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*
P-SIB
Q-SIB
done
*/