public class EscaparMetodoMain {
    
   public void outro() {
     System.out.println("Testando outro método.");  
    } 
    
   public static void main(String [] args) {
       
       EscaparMetodoMain objeto; //Definicação do Objeto, tudo que é estático
       objeto = new EscaparMetodoMain(); //construção do objeto, NÃO estático
       
       objeto.outro();
    }
}
 