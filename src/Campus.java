public class Campus {
    String name;
    void batch(){
        System.out.println("This is the 2018 batch.");
    }
}
class Collage extends Campus{
    int grade;
    @Override
    void batch() {
        System.out.println("Grade 13.");
    }
}
class TestUC{
    public static void main(String[] args) {
        Campus cm = new Collage();
        cm.name="RUSL";
        Collage cl =(Collage) cm;
        cl.grade=13;
        System.out.println(cl.name);
        System.out.println(cl.grade);
        cl.batch();
    }
}