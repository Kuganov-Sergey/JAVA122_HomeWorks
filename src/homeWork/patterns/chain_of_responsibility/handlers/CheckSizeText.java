package homeWork.patterns.chain_of_responsibility.handlers;

public class CheckSizeText implements Handler {
    @Override
    public boolean test(String text) {
        return text.length() > 0 && text.length() < 150;
    }
}
