package patterns.behavioral.visitor.visitors;


import patterns.behavioral.visitor.messages.LongInformation;
import patterns.behavioral.visitor.messages.ShortInformation;
import patterns.behavioral.visitor.visitors.abstractions.Visitor;

public class Ticker implements Visitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(LongInformation longMessage) {
        sb.append("/");
        String reducesString = longMessage.getText();
        if(reducesString.length() > 20) {
            sb.append(longMessage.getText().substring(0, 20));
        } else {
            sb.append(longMessage.getText());
        }
        sb.append("/ ");
    }

    @Override
    public void visit(ShortInformation normalMessage) {
        sb.append("/");
        sb.append(normalMessage.getText());
        sb.append("/ ");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}