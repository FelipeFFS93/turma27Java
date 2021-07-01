package introducao;

public class Graus {

	public static void main(String[] args) {
		
		String nome = "Felipe"; 
		double celsius; 
		double fahrenheit = 75.00;
		double kelvin;
		
		celsius = ((fahrenheit - 32) * 5/9);
		kelvin = celsius + 273.15;
		
		System.out.println(nome + " Sua temperatura em Celsius é: " + Math.round(celsius) + "º");
		System.out.println(nome + " Sua temperatura em Kelvin é: " + Math.round(kelvin) + "º");
		
		
		System.out.printf("%s sua temperatura em Celcius é %.2fº",nome,celsius);
		System.out.printf("\n%s sua temperatura em kelvin é %.2fº",nome,kelvin);
	}

}
