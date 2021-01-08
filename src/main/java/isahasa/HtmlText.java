package isahasa;

public class HtmlText implements TextSource {

    private String plaintText;

    public HtmlText(String plaintText) {
        this.plaintText = plaintText;
    }

    @Override
    public String getPlainText() {
        return plaintText;
    }
}
