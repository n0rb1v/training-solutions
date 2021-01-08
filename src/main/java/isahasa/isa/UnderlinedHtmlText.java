package isahasa.isa;
import isahasa.HtmlText;

public class UnderlinedHtmlText extends HtmlText {
    public UnderlinedHtmlText(String plaintText) {
        super(plaintText);
    }

    @Override
    public String getPlainText() {
        return "<u>" + super.getPlainText() + "</u>";
    }
}
