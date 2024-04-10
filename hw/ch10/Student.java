package hw.ch10;

public class Student implements Comparable<Student> {
    String name;
    String id;
    int height;

    public Student(String name, String id, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    @Override
    public int compareTo(Student s) {
        if (height > s.height) {
            return 1;
        } else if (height < s.height) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "(이름: " + name + ", 키: " + height + ")";
    }

    
    
}
