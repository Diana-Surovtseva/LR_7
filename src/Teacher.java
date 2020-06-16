public class Teacher extends Human{

    String name;
    int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teachers details: "+ name + " Age:"+ age;
    }
}
