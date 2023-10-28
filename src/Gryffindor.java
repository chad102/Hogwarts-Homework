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

    public int sumPoints () {
        super.sumPoints();
        return sumPoints() + getNoble() + getBrave() + getHonor();
    }

    public void egualStudent (Gryffindor student1, Gryffindor student2) {
        if (student1.sumPoints() > student2.sumPoints()) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            if (student1.sumPoints() < student2.sumPoints()) {
                System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
            } else {
                System.out.println("Ничья");
            }
        }
    }

    equals.
}
