public class course {
    String courseName;
    int enrolledStudents;

    static int maxCapacity = 100;

    String[] enrolled = new String[maxCapacity];

    course(String courseName) {
        this.courseName = courseName;

    }

    public void enrollStudent(String studentName) {
        enrolled[enrolledStudents] = studentName;
        enrolledStudents++;
        System.out.println("Student Added");
    }

    public void unenrollStudent(String studentName) {
        for (int i = 0; i < enrolledStudents -1; i++)
        if(enrolled[i].equals(studentName)) {
            enrolledStudents--;
        System.out.println("Student removed.");
        }
    }

    public static void setMaxCapacity(int capacity) {
        course.maxCapacity = capacity;
    }

    public static void main(String[] args) {
        course cse = new course("cse");
        course.setMaxCapacity(50);
        cse.enrollStudent("abhi");
        cse.enrollStudent("arin");
        cse.enrollStudent("angry");
        cse.enrollStudent("prash");
        cse.unenrollStudent("angry");

    }
}
