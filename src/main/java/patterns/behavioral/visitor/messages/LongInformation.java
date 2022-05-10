package patterns.behavioral.visitor.messages;

import patterns.behavioral.visitor.messages.abstractions.Element;
import patterns.behavioral.visitor.visitors.abstractions.Visitor;

public class LongInformation extends Element {

    public String text;

    public LongInformation(String text) {
        this.text = text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getText() {
        return text;
    }
}