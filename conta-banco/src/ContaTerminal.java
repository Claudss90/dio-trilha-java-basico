
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importa a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //exibir a mensagem conta criada

        Scanner scan = new Scanner((System.in));

        System.out.println("Digite seu Nome completo: ");
        String nomeCliente = scan.next();

        System.out.println("Digite o número da Agência: ");
        String numeroAgencia = scan.next();

        System.out.println("Digite o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.println("Qual o valor do primeiro depósito: ");
        float saldo = scan.nextFloat();


        System.out.println("------------------------------------------------------------------------------------------------------------------------");

       
        

      System.out.println("Olá " +nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " +numeroAgencia + ", conta " +numeroConta +" e seu saldo R$:" +saldo + " já está disponível para saque.");

      
      System.out.println("------------------------------------------------------------------------------------------------------------------------");

    }
}
