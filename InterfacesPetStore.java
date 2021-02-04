/*Toda interface por si só é abstrata
 * interface é uma classe que subiu de nível
 * em um insterface só podem existir métodos públicos e abstratos
 * Em um interface não se usa a palabra extends, usa implements
 * Só é possível extender uma classe, interface é possivel implementar várias classes
 */ 
interface Animal {
    void comer();
}

abstract class Selvagem implements Animal{
    public abstract void emitirSom();

    public boolean isDomesticavel() {
        return false;
    }

}
abstract class Pet implements Animal{
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

    public void comer() {
        System.out.println("Come ratos e animais selvagens!");
    }
}

class Cachorro extends Pet {
    public void emitirSom() {
        System.out.println("Barulhos de cachorro latindo!");
    }

    public void comer(){
        System.out.println("Come ração para CACHORRO");
    }
}

class Gato extends Pet{
    public void emitirSom() {
        System.out.println("Barulhos de gato miando!");
    }

    public void comer() {
        System.out.println("Come ração para GATO");
    }
}

public class InterfacesPetStore {
    public void executar() {
        Cachorro thor = new Cachorro();
        Gato maru = new Gato();
        Cobra maldita = new Cobra();
        thor.emitirSom();
        thor.comer();
        System.out.println("Cachorro é domesticável? " +thor.isDomesticavel());
        
        maru.emitirSom();   
        maru.comer();
        System.out.println("Gato é domesticável? " +maru.isDomesticavel());
        
        maldita.emitirSom();
        maldita.comer();
        System.out.println("Cobra é domesticável? " +maldita.isDomesticavel());

    }

    public static void main(String [] args) {
        InterfacesPetStore pet = new InterfacesPetStore();
        pet.executar();

    }
}
