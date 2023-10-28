public class Slytherin extends Hogwarts{
    private int trick;
    private int resolve;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressPower, int trick, int resolve, int ambition, int resourcefulness, int lustForPower) {
        super (name, magicPower, transgressPower);
        this.trick = trick;
        this.resolve = resolve;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    Slytherin student1 = new Slytherin("Драко Малфой", 67, 88, 1, 2, 3,44,55);
    Slytherin student2 = new Slytherin("Грэхэм Монтегю", 77, 89, 2, 3, 4, 89,45);
    Slytherin student3 = new Slytherin("Грегори Гойл", 56, 22, 3, 4, 5, 34,57);
}
