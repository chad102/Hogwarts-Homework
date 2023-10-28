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

    @Override
    public String toString() {
        return "Slytherin{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressPower=" + transgressPower +
                ", trick=" + trick +
                ", resolve=" + resolve +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
