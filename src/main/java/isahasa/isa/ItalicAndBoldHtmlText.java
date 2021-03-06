package isahasa.isa;

import isahasa.HtmlText;

public class ItalicAndBoldHtmlText extends HtmlText {
    public ItalicAndBoldHtmlText(String plaintText) {
        super(plaintText);
    }

    @Override
    public String getPlainText() {
        return "<i><b>" + super.getPlainText() + "</b></i>";
    }
}
