import java.util.Scanner;
public class imc
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

		System.out.println("Donner la taille en metre");
		double taille = scanner.nextDouble();
		System.out.println("Donner le poids en kg");
		double poids = scanner.nextDouble();
		double imc= poids / Math.pow(taille, 2);
		String ch = "";
		if(imc < 20) ch = "Trop maigre"; ;
		if(20 <= imc && imc <= 25) ch = "Normal";
		if(25 < imc) ch = "Trop maigre";
		
		System.out.print("Vous pesez " + poids + "kg, votre taille est de " + taille + "m. La valeur de votre indice de masse corporelle (IMC) est de " + String.format("%.2f", imc) + ", vous êtes "+ ch);



		

	}
}