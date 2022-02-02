package homeWork.patterns.chain_of_responsibility.handlers;

public class CheckIsDigit implements Handler {

    @Override
    public boolean test(String text) {
        return !text.matches(".*\\d+.*");
    }
}
