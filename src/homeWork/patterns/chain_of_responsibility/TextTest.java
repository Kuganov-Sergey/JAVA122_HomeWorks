package homeWork.patterns.chain_of_responsibility;

import homeWork.patterns.chain_of_responsibility.exception.TextValidException;
import homeWork.patterns.chain_of_responsibility.handlers.CheckErrorContains;
import homeWork.patterns.chain_of_responsibility.handlers.CheckIsDigit;
import homeWork.patterns.chain_of_responsibility.handlers.CheckSizeText;
import homeWork.patterns.chain_of_responsibility.handlers.Handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextTest {
    List<Handler> handlers = Arrays.asList(new CheckErrorContains(), new CheckIsDigit(), new CheckSizeText());

    public String invoke(String text) throws TextValidException {
        for(Handler handler : handlers) {
            if (!handler.test(text)) {
                throw new TextValidException();
            }
        }
        return text;
    }

}
