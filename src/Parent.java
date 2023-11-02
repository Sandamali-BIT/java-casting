public class Parent {
    void getData(){
        System.out.println("Have parent class's data.");
    }
}
class Child extends Parent{
    @Override
    void getData() {
        System.out.println("Have child class's data.");
    }
}
class Test{
    public static void main(String[] args) {
        Parent p = new Child();
        p.getData();
        }
}