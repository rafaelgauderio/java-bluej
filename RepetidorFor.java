public class RepetidorFor {

    public static void main (String [] args) {

        RepetidorFor comando = new RepetidorFor();
        comando.executar();

    }

    public void executar() {

        comandoFor();

    }

    public void comandoFor() {

        //Repeticao Determinada (sei quantas vezes eu quero repetiro o comando)

        for (byte i =0 ; i<15 ; i++) {

            System.out.println("number: " + i);

        }

        int [] x ={2,4,6,8,10};

        for(int i=0; i<x.length ; i++) {

            System.out.println("vetor x["+i+"]="+x[i]);

        }
        // for each - laço específico para criar listas e arrays
        //Tem que percorrer todo o array, sistese dele muito mais simples
        System.out.println("\nUsando o for each");
        byte j=1;
        for (int apelido : x) {

            System.out.println("vetor x["+j+"]="+apelido);
            j++;
        }

    }

}