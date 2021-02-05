
import java.util.Scanner;
import java.util.InputMismatchException;

public class Decisao {

    private Scanner sc = new Scanner(System.in);

    public static void main(String [] args) {
        try {

            Decisao decisao = new Decisao();
            //decisao.comandoDecisao();
            //decisao.verificaPar();
            decisao.comandoSwitch();
        } catch (InputMismatchException erro) {
            erro.printStackTrace();
        }

    }
    public void executar() {
        comandoDecisao();
    }

    public void comandoDecisao() {
        //in...else
        // Indicado para quando temos um range de escolhas INDETERMINADAS

        for (int i=0 ; i<=45 ; i++){
            if(i==10 || i> 20) {
                System.out.println(i + " é igual a 10 ou maior que 20");
            }
            else {
                System.out.println(i + " NÃO é igual a 10 ou maior que 20");
            }

        }

    }

    public void verificaPar() {
        System.out.print("Informe um numero inteiro: ");
        byte a = sc.nextByte(); // Byte varia entre -128 até 127
        if(a%2==0) {
            System.out.println((int)a + " é um número PAR");
        }
        else {
            System.out.println((int)a + " é um número ÍMPAR");
        }
        sc.close();

    }

    public void comandoSwitch() {
        /*
         * switch(inteiro)
         * Tipos primitos de inteiro. Tipos primitos tem apenas valores. Não tem médotos.
         *  Indicado para quando temos opções mais reduzidas (determinada) para escolher, tipo um menu com poucas escolhas.
         *  defalutl não é obrigatório e pode ser colocado em qualquer lugar.
         *  break, faz sair do switch
         * byte
         * shot
         * char
         * int
         * byte, short e int (saída sempre em base decimal)
         * char (saída em base ASCII)
         */
        byte b=5; //  Decimal
        short c=05; // Octal 0..7
        char d=0xF7; // Hexadecimal
        int e ='a'; // ASCII
        char f ='\u00FA'; //Unicode
        char g = 'b' - 'a'; //Operação entre 2 tipos inteiros, converte automaticamente para int
        byte h = (byte)(b + 3);  

        byte opcao=0;        
        System.out.print("Informe um inteiro entre 0 e 8: ");
        opcao = sc.nextByte();
        switch (opcao){
            case 0 : System.out.println("Número 0"); break;
            case 1 : System.out.println("Número 1"); break;
            case 2 : System.out.println("Número 2"); break;
            case 3 : System.out.println("Número 3"); break;
            case 4 : case 5 : case 6 : case 7 : case 8 : System.out.println("Número entre 4 e 8: escolhido foi " + opcao); break;            
            default : System.out.println("Informado um inteiro que não está no intervalo solicitado");
        }

    }

}
