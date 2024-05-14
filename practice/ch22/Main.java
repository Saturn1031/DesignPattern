package practice.ch22;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    // 버튼
    private JButton clearButton = new JButton("clear");

    public static void main(String[] args) {
        
    }

    // 생성자
    public Main(String title) {
        super(title);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
    }
}
