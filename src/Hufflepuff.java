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

    public void compareHufflepuffStudents(Hufflepuff student) {
        int sum1 = this.sumOfCharacterPoints();
        int sum2 = student.sumOfCharacterPoints();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int sumOfCharacterPoints(){
        return this.diligence + this.loyalty + this.faithfulness;
    }
}
