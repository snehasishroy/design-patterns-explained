package ChainOfResponsibility;

public abstract class Validator {
    public Validator nextValidator;

    public Validator setNextValidator(Validator next) {
        this.nextValidator = next;
        return this;
    }

    public abstract boolean isValid(Employee employee);
}
