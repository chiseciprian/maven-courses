package ro.itschool.mvnbase.curs16;

public class CharMain {
    public static void main(String[] args) throws TooLongException {
        DigitEvaluator digitEvaluator = new DigitEvaluator();

        try {
            System.out.println(digitEvaluator.evaluate(null));
            System.out.println(digitEvaluator.evaluate("5984275983498573498573498753475983475983475983475983479"));
            System.out.println(digitEvaluator.evaluate(""));
            System.out.println(digitEvaluator.evaluate("dasdas54dasd564"));
        } catch (BadCharException bce) {
            System.out.println("The word is bad : " + bce.getWord());
        } catch (TooLongException tle){
            System.out.println(tle.getWord());
        }
    }
}
