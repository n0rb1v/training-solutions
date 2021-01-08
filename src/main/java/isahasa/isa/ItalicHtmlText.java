package isahasa.isa;

import isahasa.HtmlText;

public class ItalicHtmlText extends HtmlText {
        public ItalicHtmlText(String plaintText) {
            super(plaintText);
        }

        @Override
        public String getPlainText() {
            return "<i>" + super.getPlainText() + "</i>";
        }
}
