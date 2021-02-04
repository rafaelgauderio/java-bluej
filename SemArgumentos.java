public class SemArgumentos {

    public static void main(String [] args) {

        if (args.length > 0) {
            System.out.println("Bom dia Sr(a). " + args[0]); 
        }
        else {
            System.out.println("Não foi informado nenhum parâmetro!");  
        }          
        
    }
}
