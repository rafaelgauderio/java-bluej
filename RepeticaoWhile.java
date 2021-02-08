public class RepeticaoWhile {

    public static void main (String [] args)
    {

        RepeticaoWhile comando = new RepeticaoWhile();
        comando.executar();

    }

    public void executar() {
        comandoWhile();    

    }
    byte b=5; //  Decimal
    short c=05; // Octal 0..7
    char d=0xF7; // Hexadecimal
    int e ='a'; // ASCII
    char f ='\u00FA'; //Unicode

    public void comandoWhile() {
        // Indeterminados...repetindo até atingir um determinada condição
        int integer=1;
        char number = 'a';
        while (number <= 'z') {
            System.out.println("Letter: " + number + ", position: " + integer);
            number = (char)(number + 1); // != number++; operador unário tem prioridade
            integer = integer +1;

        }
        System.out.println("End of repeat loop!");

    }
}
