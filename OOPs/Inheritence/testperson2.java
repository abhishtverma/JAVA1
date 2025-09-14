package OOPs.Inheritence;

public class testperson2 {
    public static void main(String[] args) {
        person2 per1 = new person2("Abhi", 21);
        person2 per2 = new person2("Abhi", 21);
        if (per1.equals(per2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
        // if hash code is equal then object may be equal or not equal but
        // if .equals is equal than the hash code must be equal.
        if (per1.hashCode() == per2.hashCode()) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}
