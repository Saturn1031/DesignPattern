package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();
    private Iterator<Command> it; // iterator 선언
    private Deque<Command> commandsForRedo = new ArrayDeque<>(); // 권나래: undo 되었던 Command들을 저장하는 덱

    // 실행 
    @Override
    public void execute() {
        it = commands.descendingIterator(); // 권나래: 역순으로 deque 참조
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commandsForRedo.push(commands.pop()); // 권나래: undo 기록
        }
    }

    // 권나래: redo 작성
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            commands.push(commandsForRedo.pop()); // 권나래: 다시 그릴 Command를 덱에 push
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }
}
