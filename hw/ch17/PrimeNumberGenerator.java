package hw.ch17;

import java.util.Random;

public class PrimeNumberGenerator extends NumberGenerator {
    private Random random = new Random(); 	// 난수 생성기 
    private int number;                   		// 현재 수 

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        for (int i = 0; i < 100; i++) { // 권나래: 100개의 랜덤 숫자 생성
            number = random.nextInt(100) + 1; // 권나래: 1부터 100 사이의 랜덤 숫자 생성
            int count = 0; // 권나래: 약수의 개수를 담을 변수 선언
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    count++;  // 권나래: 2부터 number의 절반 사이의 약수 개수 세기
                }
            }
            if (number > 1 && count == 0) { // 권나래: number가 1보다 크고, 2부터 number의 절반 사이에 약수가 없으면 number는 소수
                notifyObservers();
            }
        }
    }
}
