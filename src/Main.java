public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        System.out.println("-------------------------------------");

        k.setPeso(10.5f);
        k.setIdade(5);


        System.out.println("-------------------------------------");

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        System.out.println("-------------------------------------");

        m.setPeso(85.3f);
        m.setCorPelo("Cinza");
        m.setIdade(25);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println("-------------------------------------");

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        System.out.println("-------------------------------------");

        a.setPeso(0.98f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        System.out.println("-------------------------------------");


    }
}