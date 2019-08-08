package ro.itschool.mvnbase.curs16;

import static java.lang.Character.isDigit;

public class DigitEvaluator {

    public int evaluate(String whatIEvaluate) throws BadCharException, TooLongException {
        if (whatIEvaluate == null || whatIEvaluate.isEmpty()) {
            throw new BadCharException(whatIEvaluate);
        }
        if (whatIEvaluate.length() > 10) {
            throw new TooLongException(whatIEvaluate);
        }
        for (int i = 0; i < whatIEvaluate.length(); i++) {
            if (!isDigit(whatIEvaluate.charAt(i))) {
                throw new BadCharException(whatIEvaluate);
            }
        }

        int result = Integer.parseInt(whatIEvaluate);
        return result;
    }
}
