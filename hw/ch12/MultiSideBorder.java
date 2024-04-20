package hw.ch12;

public class MultiSideBorder extends Border{
    private char borderChar;
    private int num;

    protected MultiSideBorder(Display display, char ch, int num) { // 권나래: 생성자 작성
        super(display);
        this.borderChar = ch;
        this.num = num;
    }

    @Override
    public int getColumns() {
        return num + display.getColumns() + num; // 권나래: 양 옆에 장식자 개수를 추가한 정수 반환
    }

    @Override
    public int getRows() {
        return display.getRows(); // 권나래: 내용물의 행 수 반환
    }

    @Override
    public String getRowText(int row) { // 권나래: 양 옆에 장식자를 추가한 문자열 반환
        return makeBorder(borderChar, num) + display.getRowText(row) + makeBorder(borderChar, num);
    }

    private String makeBorder(char ch, int num) { // 권나래: 한 쪽 사이드 장식 문자열을 만드는 함수 작성
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < num; i++) { // 권나래: num 개수만큼 장식 문자를 연결
            border.append(ch);
        }
        return border.toString();
    }
    
}
