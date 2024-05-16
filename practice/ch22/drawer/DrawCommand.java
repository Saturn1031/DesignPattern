package practice.ch22.drawer;

import java.awt.Point; // 점의 좌표

import practice.ch22.command.Command;

public class DrawCommand implements Command {
    // 그리는 대상 
    protected Drawable drawable;

    // 그리는 위치 
    private Point position;

    // 생성자
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    // 실행
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
