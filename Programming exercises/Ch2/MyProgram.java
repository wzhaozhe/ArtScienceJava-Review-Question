import acm.program.*;;

public class MyProgram extends ConsoleProgram{
	public void run(){
		double n1 = readDouble("Enter n1 = ");
		double n2 = readDouble("Enter n2 = ");
		double a = (n1 * n2) /2;
		println("a = " + a);
	}
}
