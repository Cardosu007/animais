public class Cachorro extends Lobo{

    protected boolean dono;


    public void enterrarOsso(){
        System.out.println("Cavando e enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Feliz! Abanando o rabo!");
    }

    public void reagir(String frase){
        if(frase.equals("Toma comida")  ||  frase.equals("Olá")){
            System.out.println("Abana e latir");
        } else {
            System.out.println("Rosnar");
        }

    }

    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar");
        } else if( hora >= 18){
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e latir");
        }

    }

    public void reagir(Boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }

    }

    public void reagir(int idade, float peso){
        if(idade < 5){
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar");
        }
        if(peso < 10){
            System.out.println("Latir");
        }else {
            System.out.println("Ignorar");
        }

    }



    @Override
    public void emitirSom(){
        System.out.println("Latindo!!");
    }
}
