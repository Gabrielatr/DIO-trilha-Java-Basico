import java.util.Scanner;

public class ContaTerminal {
    
    int Numero;
    String Agencia;
    String NomeCliente;
    Double Saldo;

    public ContaTerminal(double saldo){
        Saldo = saldo;
    }

    public static void main(String[] args) throws Exception {
        
        //Scanner
        
        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal(750.55);
        int confirmar;

        //Mensagem de console

        System.out.println("Bem vindo ao nosso banco!");
        System.out.println("Deseja criar uma conta? (Para confirmar digite '1')");
        confirmar = scan.nextInt();
        clearBuffer(scan);
        
        //Obter dados
        
        if (confirmar == 1){

            System.out.println("Por favor, digite o seu nome");
            conta.NomeCliente = scan.nextLine();
            System.out.println("Por favor, digite o número da Agência !");
            conta.Agencia = scan.nextLine();
            System.out.println("Digite o número da conta: ");
            conta.Numero = scan.nextInt();

            //Impressão dos dados

            System.out.println("Olá " + conta.NomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é "+ conta.Agencia +", conta "+ conta.Numero +" e seu saldo " + conta.Saldo + ".");
        }

        System.out.println("Agradeço a preferência! Tenha um ótimo dia.");
        scan.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
