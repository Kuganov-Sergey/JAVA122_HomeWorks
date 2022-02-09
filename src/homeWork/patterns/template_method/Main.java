package homeWork.patterns.template_method;

import homeWork.patterns.template_method.templates.ConcreteTemplateMethod;
import homeWork.patterns.template_method.templates.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        TemplateMethod template = new ConcreteTemplateMethod();
        template.execute();
    }
}
