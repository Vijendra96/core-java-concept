class K 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("Please! enter atleast one colour name throungh command line argrument");
			return;
		}
		String s1 = args[0];
		switch (s1)
		{
			case "black" :
				{ 
				System.out.println("The color is BLACK!");
				break;       
				}
			case "Black" :
				{ 
				System.out.println("The color is BLACK!");
				break;       
				}
			case "BLACK" :
				{ 
				System.out.println("The color is BLACK!");
				break;       
				}
			case "red" :
				{ 
					System.out.println("The color is RED!");
					break;
				}
			case "Red" :
				{ 
					System.out.println("The color is RED!");
					break;
				}
			case "RED" :
				{ 
					System.out.println("The color is RED!");
					break;
				}
			case "blue" :
				{ 
					System.out.println("The color is BLUE!");
					break;
				} 
			case "Blue" :
				{ 
					System.out.println("The color is BLUE!");
					break;
				} 
			case "BLUE" :
				{ 
					System.out.println("The color is BLUE!");
					break;
				} 
			case "green" :
				{ 
					System.out.println("The color is GREEN!");
					break;
				}    
			case "Green" :
				{ 
					System.out.println("The color is GREEN!");
					break;
				}    
			case "GREEN" :
				{ 
					System.out.println("The color is GREEN!");
					break;
				}    
			case "yellow" :
				{
					System.out.println("The color is Yellow!");
					break; 
				}    
			case "Yellow" :
				{
					System.out.println("The color is Yellow!");
					break; 
				}    
			case "YELLOW" :
				{
					System.out.println("The color is Yellow!");
					break; 
				}    
			default :
				{
					System.out.println("Specify a color name!");
				}
		}
	}
}
