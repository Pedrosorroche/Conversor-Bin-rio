import java.util.Scanner;
public class ConversorBinario {
	public static void main(String[] args) {
		
		Scanner numDecimal = new Scanner(System.in);
		
		System.out.println("Digite o decimal:");
		int decimal = numDecimal.nextInt();
	
		
	
			int div = decimal;
			System.out.println(div);
			
			while (div != 0) {
				
				int binario = div%2;
				System.out.print(binario);
				
				div = div/2;
				
			}
		
	
	}
}
