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

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressPower=" + transgressPower +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creative=" + creative +
                '}';
    }
}
