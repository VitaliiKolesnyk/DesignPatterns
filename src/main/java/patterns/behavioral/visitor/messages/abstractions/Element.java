package patterns.behavioral.visitor.messages.abstractions;

import patterns.behavioral.visitor.visitors.abstractions.Visitor;

public abstract class Element {

    public abstract void accept(Visitor visitor);
}