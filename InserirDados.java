import java.util.Scanner;

public class InserirDados {
    private Scanner sc = new Scanner(System.in);
    public void executar() {
        System.out.println("Informe um parâmetro: ");
        int valor = sc.nextInt();
        System.out.println("Informe seu nome: ");
        String nome =sc.next();
        System.out.println("Informe sua idade: ");        
        int idade = sc.nextInt();
        System.out.println("Valor informado foi " + valor);
        System.out.println("O nome informado foi "+ nome + " e a idade "+ idade);        
        sc.close();        
    }

    public static void main(String [] args) {

        InserirDados teste = new InserirDados();
        teste.executar();
    }
}
