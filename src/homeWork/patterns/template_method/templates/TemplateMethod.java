package homeWork.patterns.template_method.templates;

public abstract class TemplateMethod {

    public void execute() {
        addName();
        selectMode();
        addDate();
        addText();
        save();
    }

    protected abstract void addName();
    protected abstract void selectMode();
    protected abstract void addDate();
    protected abstract void addText();
    protected abstract void save();
}
