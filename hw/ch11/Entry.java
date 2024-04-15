package hw.ch11;

public abstract class Entry {
    public abstract String getName();
    public abstract String getDate(); // 권나래: getDate() 메소드 추가
    public abstract int getSize();
    public abstract String getAuthor(); // 권나래: getAuthor() 메소드 추가
    public abstract int getCount();  // 권나래: getCount() 메소드 추가

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() { // 권나래: 문자열 반환 내용 수정
        return getName() + " (" + getSize() + ")" + " [" + getDate() + "]" + " [" + getCount() + "개]" + " [" + getAuthor() + "]";
    }
}
