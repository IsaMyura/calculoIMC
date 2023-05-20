import java.util.Scanner;

class CalculoIMC {
	
	public static void main(String args[]){
		
		double altura, peso, IMC;
		
    	Scanner lerTeclado = new Scanner(System.in);
    		
		System.out.print("DIGITE SUA ALTURA");
		altura = lerTeclado.nextDouble();	
		
		System.out.print("DIGITE SEU PESO");
		peso = lerTeclado.nextDouble();
		
		IMC = peso / (altura * altura) ;
		   
		 if(IMC < 18.5) { 
			System.out.print("Voce esta abaixo do peso, seu IMC eh " + IMC ); 
		 }else if(IMC >=  18.5 && IMC <= 24.9 ) { 
			System.out.print("Voce esta no peso ideal, seu IMC eh " + IMC ); 
		 }else if(IMC >= 25.0 && IMC <= 29.9 ) { 
			System.out.print("Voce esta com excesso de peso, seu IMC eh " + IMC ); 
		 }else if(IMC >= 30.0 && IMC <= 34.9 ) { 
			System.out.print("Voce esta com obesidade grau | , seu IMC eh " + IMC ); 
		 }else if(IMC >= 35.0 && IMC <= 39.9 ) { 
			System.out.print("Voce esta com obesidade grau ||, seu IMC eh " + IMC ); 
		 }else {
			 System.out.print("Voce esta com obesidade grau |||, seu IMC eh " + IMC ); 
		 }
		   
	
		System.exit(0);

	}
}
