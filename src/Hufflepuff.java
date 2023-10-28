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

    Hufflepuff student1 = new Hufflepuff("Захария Смит", 23, 19, 1, 2, 3);
    Hufflepuff student2 = new Hufflepuff("Седрик Диггори", 38, 97, 2, 3, 4);
    Hufflepuff student3 = new Hufflepuff("Джастин Финч-Флетчли", 81, 49, 3, 4, 5);
}
