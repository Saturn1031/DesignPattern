package practice.ch06;

import practice.ch06.framework.Manager;
import practice.ch06.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 클래스 이름을 이용해서 객체 생성
        Product pen1 = new UnderlinePen('=');
        pen1.use("duksung");

        Product mb1 = new MessageBox('-');
        mb1.use("duksung3");

        // 자기 복제해서 객체 생성 (클래스 이름이 사용 안 됨)
        Product pen2 = pen1.createCopy();
        pen2.use("duksung2");

        Product mb2 = mb1.createCopy();
        mb2.use("duksung4");

        // Manager를 이용해서 객체 생성
        
        // (1) 매니저 생성
        Manager manager = new Manager();

        // (2) 프로덕트 생성
        Product upen = new UnderlinePen('-');
        Product mbox = new MessageBox('*');
        Product sbox = new MessageBox('/');

        // (3) 프로덕트들을 매니저에 등록
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // (4) 매니저를 통해서 객체 생성 및 사용 (클래스 이름 사용 없이)
        Product sm = manager.create("strong message");
        sm.use("strong duksung");

        Product wb = manager.create("warning box");
        wb.use("warning duksung");

        Product sb = manager.create("slash box");
        sb.use("slash duksung");
    }
}
