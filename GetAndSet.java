class Funcionario {
    //variaveis não devem ser declaradas como publicas
    private String nome;
    public String getNome() {
        return "Contradado: " + nome ;
    }

    //this é um objeto criado para a própria classe
    public void setNome(String nome) {        
        this.nome = nome;
    }
}

public class GetAndSet {

    public void contratar() {

        Funcionario func = new Funcionario();
        func.setNome("João Pereira");        
        System.out.println(func.getNome());
    }

    public static void main(String [] args) {
        GetAndSet getAndSet = new GetAndSet();
        getAndSet.contratar();    

    }

}