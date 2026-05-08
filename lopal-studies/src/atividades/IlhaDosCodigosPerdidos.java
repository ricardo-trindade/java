package exercicios.da.aula;

import java.util.ArrayList;
import java.util.Scanner;

public class IlhaDosCodigosPerdidos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> codigos = new ArrayList<>();
		
		String codigo;
	   	System.out.println("Digite seus códigos (fim para encerrar): ");
	    while (true) {
	   	codigo = sc.next();
		if (codigo.equalsIgnoreCase("fim")) {
		break;
		}
	    codigos.add(codigo);
	    }
		
	    System.out.println("\nCódigos listados: ");
	    for (String c : codigos) {
	    System.out.println(c);
	    }
	    
	    System.out.println("\nCódigo reconstruído:");
        for (String c : codigos) {
        if (c.length() >= 2) {
        int quantidade = Character.getNumericValue(c.charAt(0));
        String letra = c.substring(1);
        for (int i = 0; i < quantidade; i++) {
        System.out.print(letra);
        }
        } else {
        System.out.print("[Código inválido] ");
        }
        }

        System.out.println(); 

}
}