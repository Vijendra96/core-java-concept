class G 
{
	String firstName; //null
	G(String firstName)
	{
		//firstName = firstName; //nul
		this.firstName = firstName; //vijendra
	}
	public static void main(String[] args) 
	{
		G g1 = new G("vijendra");
		System.out.println(g1.firstName);
	}
}

/*

//null
vijendra

*/

/*
		local and global variable have same name, then global variable is assigning to the local.
		then using this is mandetory.
*/