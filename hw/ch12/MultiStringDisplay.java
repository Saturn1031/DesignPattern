package hw.ch12;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> body = new ArrayList<>();
    private int columns = 0;

    public void add(String msg) {
        body.add(msg);

        if (columns < msg.getBytes().length) { // 권나래: 한글의 크기가 2배임을 반영
            columns = msg.getBytes().length;
        }

        updatePadding();
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }

    private void updatePadding() {
        for (int row = 0; row < body.size(); row++) {
            String line = body.get(row);

            int padding = columns - line.getBytes().length; // 권나래: 한글의 크기가 2배임을 반영

            if (padding > 0) {
                body.set(row, line + spaces(padding));
            }
        }
    }

    private String spaces(int count) {
        StringBuilder spaces = new StringBuilder();

        for (int i = 0; i < count; i++) {
            spaces.append(' ');
        }

        return spaces.toString();
    }
}
