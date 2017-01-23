public class Calculator
{
	public static void main (String[]args)
	{
			if(args[1].equalsIgnoreCase("+"))
			{
				System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[2]));

			}

			if(args[1].equalsIgnoreCase("-"))
			{
				System.out.println(Integer.parseInt(args[0])-Integer.parseInt(args[2]));

			}
	}
}