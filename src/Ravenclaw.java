public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int magicPower, int transgressPower, int intelligence, int wisdom, int wit, int creative) {
        super(name, magicPower, transgressPower);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    Ravenclaw student1 = new Ravenclaw("Чжоу Чанг", 23, 19, 83, 22, 53,23);
    Ravenclaw student2 = new Ravenclaw("Падма Патил", 38, 97, 78, 23, 52,65);
    Ravenclaw student3 = new Ravenclaw("Маркус Белби", 81, 49, 47, 23, 50,69);
}
