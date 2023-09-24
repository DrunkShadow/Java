import java.util.Scanner;
import java.util.Random;
public class NombreHasard
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int toGuess = random.nextInt(10) + 1;
        int i=0;
        while(i<3)
        {
        	System.out.println("Donner le nombre");
        	int guess = scanner.nextInt();
        	if (guess==toGuess) 
        	{
        		System.out.println(" Bravo nombre trouvé!!"); 
        		break;
        	}
        	
        	i++;
        }
    	if (i==3) System.out.print("Echec, nombre non trouvé, Veux tu rejouer?");
    	
	}
	
}