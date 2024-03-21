package hw.ch02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// 어댑터 (상속을 이용)
public class FileProperties extends Properties implements FileIO { // 권나래: Properties 클래스를 상속
    public FileProperties() {
        super();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileReader(filename)); // 권나래: 자신의 메소드 호출 (위임 X)
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileWriter(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}
