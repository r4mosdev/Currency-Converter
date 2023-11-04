package cc;
import java.util.Scanner;
public class ConverterMethods {

	Scanner scan = new Scanner (System.in);

	ConverterMethods() {

	}

	public void menu () {
		boolean status = true;
		while (status = true) {
			System.out.println("\nCURRENCY CONVEERTER\n"
					+ "\nSelect a operation that you wanna make\n"
					+ "(1)  Real to Dólar\n"
					+ "(2)  Real to Euro\n"
					+ "(3)  Real to Iene\n"
					+ "(4)  Dólar to Real\n"
					+ "(5)  Dólar to Euro\n"
					+ "(6)  Dólar to Iene\n"
					+ "(7)  Iene to Real\n"
					+ "(8)  Iene to Dólar\n"
					+ "(9)  Iene to Euro\n"
					+ "(9)  Euro to Real\n"
					+ "(10) Euro to Dólar\n"
					+ "(11) Euro to Iene\n"
					+ "(12) Exit Aplication");

			int option = scan.nextInt();

			switch (option) {
			case 1: 
				System.out.printf("%.2f%n",RealToDolar (0,0.20));
				break;
			case 2:
				System.out.printf("%.2f%n",RealToEuro (0, 0.19));
				break;
			case 3:
				System.out.printf("%.2f%n",RealToIene (0, 30.48));		
				break;
			case 4:
				System.out.printf("%.2f%n",DolarToReal (0, 4.91));
				break;
			case 5:
				System.out.printf("%.2f%n",DolarToEuro (0, 0.93));
				break;
			case 6:
				System.out.printf("%.2f%n",DolarToIene (0, 149.37));
				break;
			case 7:
				System.out.printf("%.2f%n",IeneToReal (0, 0.033));
				break;
			case 8:
				System.out.printf("%.2f%n",IeneToDolar (0, 0.0067));
				break;
			case 9:
				System.out.printf("%.2f%n",EuroToReal (0, 5.28));
				break;
			case 10:
				System.out.printf("%.2f%n",EuroToDolar (0, 1.07));
				break;
			case 11:
				System.out.printf("%.2f%n",EuroToIene (0, 160.39));
				break;
			case 12:
				status = false;
				break;
			}
		}
	}

	public double RealToDolar (double value, double Dolar) {
		System.out.println("How many Reais do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Dolar == 0?"The value to Dólar that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Dolar;
	}

	public double RealToEuro (double value, double Euro) {
		System.out.println("How many Reais do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Euro == 0?"The value to Euro that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Euro;
	}

	public double RealToIene (double value, double Iene) {
		System.out.println("How many Reais do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Iene == 0?"The value to Iene that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Iene;
	}

	public double DolarToReal (double value, double Real) {
		System.out.println("How many Dolars do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Real == 0?"The value to Real that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Real;
	}

	public double DolarToEuro (double value, double Euro) {
		System.out.println("How many Dolars do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Euro == 0?"The value to Euro that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Euro;
	}

	public double DolarToIene (double value, double Iene) {
		System.out.println("How many Dolars do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Iene == 0?"The value to Iene that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Iene;
	}

	public double IeneToReal (double value, double Real) {
		System.out.println("How many Ienes do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Real == 0?"The value to Real that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Real;
	}

	public double IeneToDolar (double value, double Dolar) {
		System.out.println("How many Ienes do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Dolar == 0?"The value to Dólar that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Dolar;
	}

	public double IeneToEuro (double value, double Euro) {
		System.out.println("How many Ienes do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Euro == 0?"The value to Euro that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Euro;
	}

	public double EuroToReal (double value, double Real) {
		System.out.println("How many Euros do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Real == 0?"The value to Real that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Real;
	}

	public double EuroToDolar (double value, double Dolar) {
		System.out.println("How many Euros do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Dolar == 0?"The value to Dólar that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Dolar;
	}

	public double EuroToIene (double value, double Iene) {
		System.out.println("How many Euros do you want to convert?");
		value = scan.nextDouble();
		System.out.println(Iene == 0?"The value to Iene that you informed on the parameter are 0 (zero)! Try again.": "");
		System.out.println(value == 0?"The value that you informed are 0 (zero)! Try again.": "");
		return value *= Iene;
	}

}
