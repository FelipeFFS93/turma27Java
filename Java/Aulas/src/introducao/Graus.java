package introducao;

public class Graus {

	public static void main(String[] args) {
		
		String nome = "Felipe"; 
		double celsius; 
		double fahrenheit = 75.00;
		double kelvin;
		
		celsius = ((fahrenheit - 32) * 5/9);
		kelvin = celsius + 273.15;
		
		System.out.println(nome + " Sua temperatura em Celsius �: " + Math.round(celsius) + "�");
		System.out.println(nome + " Sua temperatura em Kelvin �: " + Math.round(kelvin) + "�");
		
		
		System.out.printf("%s sua temperatura em Celcius � %.2f�",nome,celsius);
		System.out.printf("\n%s sua temperatura em kelvin � %.2f�",nome,kelvin);
	}

}
