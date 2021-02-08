import java.util.Scanner;

public class RepeticaoDo {

    private Scanner sc = new Scanner (System.in);

    public static void main (String [] args)
    {

        RepeticaoDo comando = new RepeticaoDo();
        comando.executar();

    }

    public void executar() {
        comandoDo();    

    }
    byte b=5; //  Decimal
    short c=05; // Octal 0..7
    char d=0xF7; // Hexadecimal
    int e ='a'; // ASCII
    char f ='\u00FA'; //Unicode

    public void comandoDo() {
        // Indeterminados...repetindo até atingir um determinada condição
        byte number = 1;

        // no while primeira pergunta e depois começa a fazer
        // no do primeiro faz e depois começa a perguntar por quanto tempo vai fazer
        do {
            System.out.print(" " + number);
            number +=1;
        }
        while (number<15) ;      

        System.out.println("\nEnd of repeat loop!");

        do {
            System.out.println("Enter -1 to exit program");
            number = sc.nextByte();
        }   
        while (number !=-1); 

        System.out.println("\nProgram close");

    }
}
