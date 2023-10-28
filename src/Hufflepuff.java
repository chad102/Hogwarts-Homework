public class Hufflepuff extends  Hogwarts{
    private int diligence;
    private int loyalty;
    private int faithfulness;

    public Hufflepuff(String name, int magicPower, int transgressPower, int diligence, int loyalty, int faithfulness) {
        super(name, magicPower, transgressPower);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.faithfulness = faithfulness;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressPower=" + transgressPower +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", faithfulness=" + faithfulness +
                '}';
    }
}
