package isahasa.isa;

import isahasa.HtmlText;

public class UnderlinedAndItalicAndBoldHtmlText extends HtmlText {
    public UnderlinedAndItalicAndBoldHtmlText(String plaintText) {
        super(plaintText);
    }

    @Override
    public String getPlainText() {
        return "<u><i><b>" + super.getPlainText() + "</b></i></u>";
    }
}
