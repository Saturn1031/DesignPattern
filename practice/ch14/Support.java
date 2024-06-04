package practice.ch14;

public abstract class Support {
    private String name;    // 이 트러블 해결자 이름
    private Support next;   // 떠넘길 곳 (부모 타입으로 선언됨)

    public Support(String name) {
        this.name = name;
        this.next = null; // 초기화
    }

    // 떠넘길 곳을 설정한다
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 트러블 해결 절차를 결정한다 (템플릿 메소드)
    public void support(Trouble trouble) {
        if (resolve(trouble)) { // 내가 해결했다면...
            done(trouble);
        } else if (next != null) { // 내가 해결 못 하고, 뒷사람이 있다면...
            next.support(trouble); // 뒷사람에 넘긴다 (재귀적 호출)
        } else { // 뒷사람이 없으면 (내가 맨 마지막이면)
            fail(trouble);
        }

        // for 루프로 구현
        /*
        for (Support obj = this; true; obj = obj.next) {
            if (obj.resolve(trouble)) {
                obj.done(trouble);
                break;
            } else if (obj.next == null) {
                obj.fail(trouble);
                break;
            }
        }
        */
    }

    // 트러블 해결자의 문자열 표현
    @Override
    public String toString() {
        return "[" + name + "]";
    }

    // 해결하려고 한다
    protected abstract boolean resolve(Trouble trouble); // 자식들이 구현함

    // 해결했다 
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결되지 않았다 
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
