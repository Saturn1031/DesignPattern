package practice.ch22.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import practice.ch22.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {
    // 그리는 색 
    private Color color = Color.red;
    // 그리는 점의 반지름 
    private int radius = 6;
    // 이력 
    private MacroCommand history;

    // 생성자 
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    // 이력 전체 다시 그리기 
    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    // 그리기 
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    // 붓의 색깔을 설정하는 메소드
    public void setColor(Color color) {
        this.color = color;
    }
}
