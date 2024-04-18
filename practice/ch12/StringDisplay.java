package practice.ch12;

// 중심이 되는 클래스
public class StringDisplay extends Display {
    private String string; // 표시 문자열 

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) { // 행 번호는 0번부터 시작
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string;
    }
}
