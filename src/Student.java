public class Student extends Human{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students details" + name+" Age:" + age;
    }
}
