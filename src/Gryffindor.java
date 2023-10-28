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
    Gryffindor student1 = new Gryffindor("Гарри Поттер", 67, 88, 23, 20, 30);
    Gryffindor student2 = new Gryffindor("Гермиона Грейнджер", 77, 89, 66, 39, 43);
    Gryffindor student3 = new Gryffindor("Рон Уизли", 56, 22, 91, 40, 54);

    public int getNoble() {
        return noble;
    }

    public void setNoble(int noble) {
        this.noble = noble;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public Gryffindor getStudent1() {
        return student1;
    }

    public Gryffindor getStudent2() {
        return student2;
    }

    public Gryffindor getStudent3() {
        return student3;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressPower=" + transgressPower +
                ", noble=" + noble +
                ", honor=" + honor +
                ", brave=" + brave +
                '}';
    }
}
