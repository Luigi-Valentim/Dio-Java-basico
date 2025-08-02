import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: connhecer e importar a classe Scanner

        //Exebir a mensagens para o nosso usuario

        //Obter pela Scanner os valores digitados no terminal

        //Exbir a mensagem conta criada

         Scanner scanner = new Scanner(System.in);
          System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final formatada
        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close(); 


    }
}
