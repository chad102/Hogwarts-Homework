public class Hogwarts {
    protected String name;
    protected int magicPower;
    protected int transgressPower;

    public Hogwarts(String name, int magicPower, int transgressPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressPower = transgressPower;
    }
    public static void printStudent() {
        System.out.println(student1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressPower() {
        return transgressPower;
    }

    public void setTransgressPower(int transgressPower) {
        this.transgressPower = transgressPower;
    }
}
