package practice.ch17;

// 관찰자
public interface Observer {
    public abstract void update(NumberGenerator generator); // 통지받는 메소드
}
