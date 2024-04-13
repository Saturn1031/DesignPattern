package hw.ch10;

public class Student implements Comparable<Student> { // 권나래: Comparable 인터페이스 구현
    String name;
    String id;
    int height;

    public Student(String name, String id, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    @Override
    public int compareTo(Student s) { // 권나래: 인자로 들어온 학생의 키와 비교
        if (height > s.height) {
            return 1;
        } else if (height < s.height) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() { // 권나래: 읽기 좋게 문자열로 출력
        return "(이름: " + name + ", 키: " + height + ")";
    }
}
