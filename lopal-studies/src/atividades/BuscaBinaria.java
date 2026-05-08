package exercicios.da.aula;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};

		System.out.print("Digite o feitiço que deseja encontrar: ");
		String alvo = sc.nextLine();
		
		 int inicio = 0;
	     int fim = feiticos.length - 1;
	     boolean encontrado = false;

	     while (inicio <= fim) {
	     int meio = (inicio + fim) / 2;
	     int comparacao = alvo.compareToIgnoreCase(feiticos[meio]); // Ignora maiúsculas/minúsculas

	     if (comparacao == 0) {
	     System.out.println("Feitiço encontrado na posição " + meio);
	     encontrado = true;
	     break;
	     } else if (comparacao < 0) {
	     fim = meio - 1;
	     } else {
	     inicio = meio + 1;
	     }
	     }
	        
	     if (!encontrado) {
         System.out.println("Feitiço não encontrado.");
	     }

	     sc.close();
	}

}
