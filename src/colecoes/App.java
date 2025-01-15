package colecoes;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		int i = 1;
		String confirm;
		String resp;
		String respArray[];
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> listaM = new ArrayList<String>();
		ArrayList<String> listaF = new ArrayList<String>();
		while(i==1) {
			System.out.println("Deseja fazer um registro: ");
			confirm =ler.next();
			
			if(confirm.equalsIgnoreCase("sim")) {
				System.out.println("Digite o seu nome e sexo: (Separados por uma virgula EX: João , masculino)");
				resp=ler.nextLine();
				respArray =resp.split(",");
				if(respArray.length >= 2) { 	
					if (respArray[1].equalsIgnoreCase("masculino")) {
					listaM.add(respArray[0]);
				
					} else {
					listaF.add(respArray[0]);
					}		
				}else {
						System.out.println("Entrada inválida. Certifique-se em digitar o nome e o sexo separados por uma vírgula.");
					}
			}else{
				i = 0;
				System.out.println("Lista Masculina: ");
				System.out.println(listaM);
				System.out.println("Lista Feminina: ");
				System.out.println(listaF);
			}
		}
		}
}
	
	


