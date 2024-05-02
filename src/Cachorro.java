public class Cachorro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("Cavando e enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Feliz! Abanando o rabo!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Latindo!!");
    }
}
