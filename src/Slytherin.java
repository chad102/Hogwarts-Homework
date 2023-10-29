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

    public void compareSlytherinStudents(Slytherin student) {
        int sum1 = this.sumOfCharacterPoints();
        int sum2 = student.sumOfCharacterPoints();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else if (sum1 < sum2) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int sumOfCharacterPoints(){
        return this.trick + this.resolve + this.ambition + this.resourcefulness + this.lustForPower;
    }
}
