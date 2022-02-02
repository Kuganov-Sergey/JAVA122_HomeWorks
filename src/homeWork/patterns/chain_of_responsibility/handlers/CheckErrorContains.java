package homeWork.patterns.chain_of_responsibility.handlers;

public class CheckErrorContains implements Handler {

    @Override
    public boolean test(String text) {
        return !text.contains("error");
    }
}
