package practice.ch14;

public class Main {
    public static void main(String[] args) {
        // Trouble 테스트
        Trouble t1 = new Trouble(77);
        System.out.println(t1.getNumber());
        System.out.println(t1);

        // 해결자들
        Support noSupport = new NoSupport("no");
        Support oddSupport = new OddSupport("odd");
        Support limitSupport  = new LimitSupport("limit", 100);
        Support specialSupport = new SpecialSupport("special", 77);

        // 사슬 형성
        noSupport.setNext(specialSupport).setNext(oddSupport).setNext(limitSupport);

        // 맨 앞사람에게 해결을 요청
        for(int i = 0; i < 200; i++) {
            noSupport.resolve(new Trouble(i));
        }
    }
}
