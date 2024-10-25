import java.util.Scanner;

public class Cardapio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("### Sistemas de Pedidos ###");
		System.out.println("Cardápio e opções:\n \n"
				+ "1 - X-SALADA - R$ 17,00\n"
				+ "2 - X-TUDO - R$ 23,00\n");
		
		System.out.println("Digite o item do menu!");
		int item = sc.nextInt();
		
		
		sc.close();
	}

}
