package hw.ch16;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueCheckbox checkMember; // 권나래: 멤버 체크박스 추가
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueTextField textRegister; // 권나래: 주민등록번호 텍스트 필드 추가
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    // Colleague를 생성하고 배치한 후에 표시한다
    public LoginFrame(String title) {
        super(title);

        // 배경색을 설정한다
        setBackground(Color.lightGray);

        // 레이아웃 매니저를 사용해 4×2 그리드를 만든다
        setLayout(new GridLayout(5, 3));

        // Colleague를 생성한다 
        createColleagues();

        // 배치한다 
        add(checkGuest);
        add(checkLogin);
        add(checkMember);

        add(new Label("Username:"));
        add(textUser);
        add(new Label(""));

        add(new Label("Password:"));
        add(textPass);
        add(new Label(""));

        add(new Label("주민등록번호:"));
        add(textRegister);
        add(new Label(""));

        add(buttonOk);
        add(buttonCancel);
        add(new Label(""));

        // 활성/비활성 초기 설정을 한다
        colleagueChanged();

        // 표시한다 
        pack();
        setVisible(true);
    }

    // Colleague를 생성한다
    @Override
    public void createColleagues() {
        // CheckBox
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        checkMember = new ColleagueCheckbox("Member", g, false);

        // TextField
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        textRegister = new ColleagueTextField("", 10);

        // Button
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // Mediator를 설정한다 
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        checkMember.setMediator(this); // 권나래: 멤버 체크박스 Mediator 설정
        textUser.setMediator(this);
        textPass.setMediator(this);
        textRegister.setMediator(this); // 권나래: 주민등록번호 입력창 Mediator 설정
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Listener 설정
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        checkMember.addItemListener(checkMember); // 권나래: 멤버 체크박스 리스너 설정
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        textRegister.addTextListener(textRegister); // 권나래: 주민등록번호 입력창 리스너 설정
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // Colleage의 상태가 바뀌면 호출된다
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            // 게스트 로그인 
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            textRegister.setColleagueEnabled(false); // 권나래: 주민등록번호 입력창 비활성화
            buttonOk.setColleagueEnabled(true);
        } else if (checkLogin.getState()) {
            // 사용자 로그인 
            textUser.setColleagueEnabled(true);
            userpassChanged();
        } else {
            // 권나래: 멤버 로그인
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    // textUser 또는 textPass의 변경이 있다 
    // 각 Colleage의 활성/비활성을 판정한다
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                textRegister.setColleagueEnabled(true); // 권나래: 주민등록번호 입력창 활성화
                if (textRegister.getText().length() > 0) {
                    if (!Character.isDigit(textRegister.getText().charAt(textRegister.getText().length() - 1))) {
                        // 권나래: 마지막 입력값이 숫자가 아니면 경고창 출력
                        JOptionPane.showMessageDialog(this, "숫자를 입력하세요.");
                        // 권나래: 입력했던 마지막 한 문자 삭제
                        textRegister.setText(textRegister.getText().substring(0, textRegister.getText().length() - 1));
                        // 권나래: 커서 이동
                        textRegister.setCaretPosition(textRegister.getText().length());
                    }
                    if (textRegister.getText().length() == 13) {
                        // 권나래: 13자리 숫자가 입력되면 OK 버튼 활성화
                        buttonOk.setColleagueEnabled(true);
                    } else {
                        buttonOk.setColleagueEnabled(false);
                    }
                } else {
                    buttonOk.setColleagueEnabled(false);
                }
            } else {
                textRegister.setColleagueEnabled(false);
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            textRegister.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
