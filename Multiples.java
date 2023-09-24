public class Multiples
{
	public static void main (String[] args)
	{
		for (int i=1; i<=50;i++)		{
			System.out.print(i);
			if (i%3==0 && i%5 ==0) System.out.print(" Multiple double: 3 et 5");
			else if (i%3==0) System.out.print(" Multiple de 3");
			else if (i%5==0) System.out.print(" Multiple de 5");
			System.out.println("");
		}
	}
}