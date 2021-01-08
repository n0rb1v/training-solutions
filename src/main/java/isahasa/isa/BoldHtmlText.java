package isahasa.isa;

import isahasa.HtmlText;

public class BoldHtmlText extends HtmlText {
    public BoldHtmlText(String plaintText) {
        super(plaintText);
    }

    @Override
    public String getPlainText() {
        return "<b>" + super.getPlainText() + "</b>";
    }
}
