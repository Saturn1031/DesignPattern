package hw.ch10;

import java.util.Comparator;

public class ComparatorDesending implements Comparator<Student>{ // 권나래: Comparator 인터페이스 구현

    @Override
    public int compare(Student s1, Student s2) {
        return s2.compareTo(s1); // 권나래: s2 학생의 키가 더 크면 s1 학생과 위치 바꿈 (내림차순)
    }
    
}
