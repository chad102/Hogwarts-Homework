public class Gryffindor extends Hogwarts {
    private int noble;
    private int honor;
    private int brave;

    public Gryffindor (String name, int magicPower, int transgressPower,int noble, int honor, int brave) {
        super (name, magicPower, transgressPower);
        this.noble = noble;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNoble() {
        return noble;
    }

    public int getHonor() {
        return honor;
    }

    public int getBrave() {
        return brave;
    }

    @Override
    public String toString() {
        super.toString(); // не понял замечания IDEA по поводу игнорирования родительского метода
        return "Gryffindor{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressPower=" + transgressPower +
                ", noble=" + noble +
                ", honor=" + honor +
                ", brave=" + brave +
                '}';
    }

    public void compareGryffindorStudents(Gryffindor student) {
        int sum1 = this.sumOfCharacterPoints();
        int sum2 = student.sumOfCharacterPoints();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int sumOfCharacterPoints(){
        return this.noble + this.honor + this.honor;
    }
}
