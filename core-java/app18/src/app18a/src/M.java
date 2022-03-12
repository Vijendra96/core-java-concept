class M 
{
    public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("please! enter month and year in the format of mm yyyy through command line args");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
        int month = Integer.parseInt(s1);
        int year = Integer.parseInt(s2);
        int numDays = 0;

        switch (month) 
		{
            case 1: 
			case 3:
			case 5:
            case 7: 
			case 8: 
			case 10:
            case 12:
                numDays = 31;
                break;
            case 4: 
			case 6:
            case 9: 
			case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
		}
        System.out.println("Number of Days = " + numDays);
    }
}