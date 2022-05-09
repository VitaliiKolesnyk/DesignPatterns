package patterns.behavioral.interpreter.context;

import patterns.behavioral.interpreter.expressions.Expression;
import patterns.behavioral.interpreter.expressions.MinusExpression;
import patterns.behavioral.interpreter.expressions.NumberExpression;
import patterns.behavioral.interpreter.expressions.PlusExpression;

public class Context {

    public Expression evaluateExpression (String stringExpression) {
        int position = stringExpression.length() - 1;
        while (position > 0) {
            if(Character.isDigit(stringExpression.charAt(position))) {
                position--;
            } else {
                Expression left = evaluateExpression(stringExpression.substring(0, position));
                Expression right = new NumberExpression(Integer.valueOf(stringExpression.substring(position + 1, stringExpression.length())));
                Character operator = stringExpression.charAt(position);
                switch (operator) {
                    case '-': return new MinusExpression(left, right);
                    case '+': return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.valueOf(stringExpression);
        return new NumberExpression(result);
    }
}
