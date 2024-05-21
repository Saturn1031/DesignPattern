package practice.ch22;

import javax.swing.*;

import practice.ch22.command.*;
import practice.ch22.drawer.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
// public class Main extends JFrame implements ActionListener, WindowListener {
public class Main extends JFrame implements WindowListener {

    // 버튼
    private JButton clearButton = new JButton("clear");

    // 그리기 이력
    private MacroCommand history = new MacroCommand();

    // 도화지
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    // 색깔 버튼
    private JButton redButton = new JButton("red");
    private JButton greenButton = new JButton("green");
    private JButton blueButton = new JButton("blue");

    public static void main(String[] args) {
        new Main("권나래: Command pattern sample");
    }

    // 생성자
    public Main(String title) {
        super(title);

        // GUI 컴포넌트 추가
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);

        getContentPane().add(mainBox);

        // 리스너 등록
        // clearButton.addActionListener(this);
        clearButton.addActionListener(e -> {
            System.out.println("clear 버튼 눌려짐");
            history.clear();

            // 화면에서도 지움
            canvas.repaint(); // 화면을 지움 => paint()
        });

        // canvas.addMouseMotionListener(this);
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                // DrawCommand 객체를 만들어서 history에 추가
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);

                // DrawCommand 실행(그리기)
                cmd.execute();
            }
        });

        redButton.addActionListener(e -> {
            // ColorCommand 생성해서 히스토리에 추가
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);

            // ColorCommand 실행 (붓의 색깔 바꾸기)
            cmd.execute();
        });

        greenButton.addActionListener(e -> {
            // ColorCommand 생성해서 히스토리에 추가
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);

            // ColorCommand 실행 (붓의 색깔 바꾸기)
            cmd.execute();
        });

        blueButton.addActionListener(e -> {
            // ColorCommand 생성해서 히스토리에 추가
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);

            // ColorCommand 실행 (붓의 색깔 바꾸기)
            cmd.execute();
        });

        this.addWindowListener(this);

        // this.add(buttonBox);

        // 화면에 보이기
        pack();
        setVisible(true);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     // System.out.println("clear 버튼 눌려짐");
    //     history.clear();

    //     // 화면에서도 지움
    //     canvas.repaint(); // 화면을 지움 => paint()
    // }

    // @Override
    // public void mouseDragged(MouseEvent e) {
    //     // System.out.println("마우스 드래그 중");
    //     // DrawCommand 객체를 만들어서 history에 추가
    //     Command cmd = new DrawCommand(canvas, e.getPoint());
    //     history.append(cmd);

    //     // DrawCommand 실행(그리기)
    //     cmd.execute();
    // }

    // @Override
    // public void mouseMoved(MouseEvent e) {
    //     // System.out.println("마우스 움직이는 중");
    // }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("종료합니다...");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}
