package hw.ch07;

// 권나래: XMLBuilder 클래스 작성
public class XMLBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("<document>\n");
        sb.append("\t<title>");
        sb.append(title);
        sb.append("</title>\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("\t<string>");
        sb.append(str);
        sb.append("</string>\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("\t<items>\n");
        for (String s: items) {
            sb.append("\t\t<item>");
            sb.append(s);
            sb.append("</item>\n");
        }
        sb.append("\t</items>\n");
    }

    @Override
    public void close() {
        sb.append("</document>\n");
    }

    public String getXmlResult() {
        return sb.toString();
    }
}
