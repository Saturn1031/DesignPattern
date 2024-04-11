package practice.ch11;

// 내용물을 나타냄
public abstract class Entry {
    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    // 메소드 오버로딩
    // 목록을 표시한다
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() { // 템플릿 메소드
        return getName() + " (" + getSize() + ")";
    }
}
