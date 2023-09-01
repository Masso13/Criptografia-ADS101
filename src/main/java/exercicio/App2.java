package exercicio;

import java.util.Scanner;

public class App2 
{
    public static void main( String[] args )
    {
        Criptografia2 criptografia = new Criptografia2(7, 10);
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("           Criptografia\n");
            System.out.println("(1) Criptografar\n(2) Descriptografar\n(3) Fechar\n");
            System.out.print("> ");

            int escolha = teclado.nextInt();
            if (escolha == 1 || escolha == 2) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Digite o 1° digito: ");
                int digit1 = teclado.nextInt();

                System.out.print("Digite o 2° digito: ");
                int digit2 = teclado.nextInt();

                System.out.print("Digite o 3° digito: ");
                int digit3 = teclado.nextInt();

                System.out.print("Digite o 4° digito: ");
                int digit4 = teclado.nextInt();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

                switch (escolha) {
                    case 1:
                        criptografia.crypto(digit1, digit2, digit3, digit4);
                        break;
                    case 2:
                        criptografia.decrypto(digit1, digit2, digit3, digit4);
                        break;
                }
            }
            else if (escolha == 3) {
                break;
            }
        }
        teclado.close();
    }
}
