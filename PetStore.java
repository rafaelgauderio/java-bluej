abstract class Selvagem{

    public abstract void emitirSom();
    public boolean isDomesticavel() {
        return false;
    }

}
abstract class Pet {
    //pet não existe como objeto, tem que ser um classe abstrata
    //classe abstrata não vai gerar objeto
    public abstract void emitirSom();

    public boolean isDomesticavel() {
        return true;
    }
}
//Tem que implemtar todos os métoso não abstrados em um classe não abstrada
// que extends a classe abstrada
class Cobra extends Selvagem {
    public void emitirSom() {
        System.out.println("Som simbilantes de uma cobra!");
    }
}

class Cachorro extends Pet {
    public void emitirSom() {
        System.out.println("Barulhos de cachorro latindo!");

    }
}
class Gato extends Pet{

    public void emitirSom() {
        System.out.println("Barulhos de gato miando!");
    }
}

public class PetStore {
    public void executar() {
        Cachorro thor = new Cachorro();
        Gato maru = new Gato();
        Cobra maldita = new Cobra();
        thor.emitirSom();
        System.out.println("Cachorro é domesticável? " +thor.isDomesticavel());
        maru.emitirSom();        
        System.out.println("Gato é domesticável? " +maru.isDomesticavel());
        maldita.emitirSom();
        System.out.println("Cobra é domesticável? " +maldita.isDomesticavel());
        
        
    }

    public static void main(String [] args) {
        PetStore pet = new PetStore();
        pet.executar();

    }
}