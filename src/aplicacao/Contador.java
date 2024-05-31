package aplicacao;

import java.util.Scanner;

import exceptions.ParametrosinvalidosExeption;

public class Contador {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Contador");
		 System.out.println("Digite um número:");
		 int parametro1 = sc.nextInt();
		 
		 System.out.println("Digite um segundo número:");
		 int parametro2 = sc.nextInt();
		 
		 
		 try{
			 contar(parametro1,parametro2);
			 
		 }catch(ParametrosinvalidosExeption exeption) {
			 System.out.println("O segundo parametro deve ser maior que o primeiro");
		 }
	}
	
	
	static void contar(int parametro1, int parametro2) throws ParametrosinvalidosExeption {
		
        if (parametro1 >= parametro2) {
            throw new ParametrosinvalidosExeption("O segundo parâmetro deve ser maior que o primeiro.");
        }
		
        int contagem = parametro2 - parametro1;
        System.out.println("Imprimindo o número "+parametro1);
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (parametro1 + i + 1 ));
        }
		
	}

}
