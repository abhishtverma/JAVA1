public class finalKeyword16 {
    public final int salary = 30000;
    public final String name;
    public final int age;

    public finalKeyword16(String name, int age) {
        this.name = name;
        this.age = age;

    }
    // no value is going to change after constructor if final keyword is applied on
    // variable/s

    @Override
    public String toString() {
        return "finalKeyword16 [salary=" + salary + ", name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        finalKeyword16 Final = new finalKeyword16("Abhi", 21);
        finalKeyword16 Final2 = new finalKeyword16("Verma", 22);
        System.out.println(Final.toString());
        System.out.println(Final2.toString());
    }
}
