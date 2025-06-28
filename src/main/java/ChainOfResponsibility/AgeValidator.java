package ChainOfResponsibility;

public class AgeValidator extends Validator {
    @Override
    public boolean isValid(Employee employee) {
        System.out.println("Running Age Validator");
        if (nextValidator == null) {
            return isAgeValid(employee.age());
        } else if (isAgeValid(employee.age())) {
            return nextValidator.isValid(employee);
        } else {
            System.out.println("Age is not valid");
            return false;
        }
    }

    private boolean isAgeValid(int age) {
        return age >= 18 && age <= 70;
    }
}
