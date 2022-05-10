package patterns.behavioral.visitor.visitors.abstractions;

import patterns.behavioral.visitor.messages.LongInformation;
import patterns.behavioral.visitor.messages.ShortInformation;

public interface Visitor {

    void visit(LongInformation e);

    void visit(ShortInformation e);
}
