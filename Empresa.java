//tutorial classe Object
//Classe Object é pai de todas as outras classes
//Toda classe é uma extensão da Classe Object
class Funcionario extends Object{

    private int matricula;
    private String nome;    
    //construtor não tem retorno e o mesmo nome da classe    
    public Funcionario() {

    }

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int hashCode() {
        return matricula;
    }

    public String toString() {
        return nome;
    }

   public boolean equals(Object objeto) {
    if (this.hashCode() == objeto.hashCode()) {
        return true;
    }
    else {
        return false;
    }
    
    
    }
}
    public class Empresa {
        
        public void contratar(){
            Funcionario rafael = new Funcionario(1, "Rafael De Luca");
            Funcionario claudia = new Funcionario(1, "Claudia da Silva");
            Funcionario juliana = new Funcionario(2,"Juliana Pereira");
            
            System.out.println(rafael);
            System.out.println(claudia);
            System.out.println(juliana);
            
            if (rafael.equals(claudia)) {
                System.out.println("São o mesmo funcionário");
            }
            else {
                System.out.println("Não é o mesmo funcionário");
            }
            
            if (rafael.equals(juliana)) {
                System.out.println("São o mesmo funcionário");
            }
            else {
                System.out.println("Não é o mesmo funcionário");
            }

            
        }

        public static void main(String [] args) {

            Empresa empresa = new Empresa();
            empresa.contratar();
        }   
    }


