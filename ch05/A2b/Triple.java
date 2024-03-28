package ch05.A2b;

public enum Triple {
    ALPHA, BETA, GAMMA;

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name); // 상수 값에 해당하는 Triple 인스턴스 반환
    }
}
