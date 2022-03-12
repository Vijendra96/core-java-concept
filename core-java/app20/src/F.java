import java.util.ArrayList;
class F 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("hello");
		list.add("how");
		list.add("are");
		list.add("you");
		list.add("today");
		for(String s1 : list)
		{	
		System.out.println(s1);
		}
	}
}
