public class toString12 {
    String name;
    int age;

    public toString12(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "toString12 [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        toString12 string = new toString12("Abhi", 21);
        System.out.println(string);
    }
}
