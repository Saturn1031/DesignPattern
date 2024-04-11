package hw.ch10;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<Student>{ // 권나래: Comparator 인터페이스 구현

    @Override
    public int compare(Student s1, Student s2) {
        return s1.compareTo(s2); // 권나래: s1 학생의 키가 더 크면 s2 학생과 위치 바꿈 (오름차순)
    }
    
}
