package hw.ch03;

public class KwonNaraeDisplay extends AbstractDisplay {
    String name; // 권나래: 멤버 변수 추가
    String studentId;
    int grade;

    public KwonNaraeDisplay(String name, String studentId, int grade) { // 권나래: 생성자 작성
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // 권나래: 각 메소드 수정
    @Override
    public void open() {
        System.out.println("====================");
        System.out.println("덕성여대 컴퓨터공학과");
    }

    @Override
    public void print() {
        System.out.println("학번 " + studentId + " / " + grade + "학년 / " + name);
    }

    @Override
    public void close() {
        System.out.println("템플릿 메소드 패턴 숙제입니다.");
        System.out.println("====================");
    }
    
}
