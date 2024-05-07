package practice.ch19;

public class NoonState implements State {

    @Override
    public void doClock(Context context, int hour) {
        // 상태를 변경(점심에서 주간(오후)으로 변경)
        
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상상황(점심)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(점심)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("통화녹음(점심)");
    }
    
}
