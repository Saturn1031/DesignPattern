package hw.ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220878 이름: 권나래");
        System.out.println();

        List<Student> list = Arrays.asList(
            new Student("최승훈", "20220878", 190),
            new Student("권나래", "20220878", 150),
            new Student("편도나", "20220878", 160),
            new Student("남시윤", "20220878", 170),
            new Student("윤예원", "20220878", 180)
        );

        System.out.println("** (1) 정렬 결과 (오름차순)");
        list.sort(new ComparatorAscending());
        System.out.println(list);
        System.out.println();

        System.out.println("** (1) 정렬 결과 (내림차순)");
        list.sort(new ComparatorDesending());
        System.out.println(list);
    }
}
