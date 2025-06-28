package ChainOfResponsibility;

public class NameValidator extends Validator {
    @Override
    public boolean isValid(Employee employee) {
        System.out.println("Running Name Validator");
        if (nextValidator == null) {
            return isNameValid(employee);
        } else if (isNameValid(employee)) {
            return nextValidator.isValid(employee);
        } else {
            System.out.println("Employee name is invalid");
            return false;
        }
    }

    private static boolean isNameValid(Employee employee) {
        return !employee.firstName().isBlank()
                && !employee.firstName().isEmpty()
                && !employee.lastName().isEmpty()
                && !employee.lastName().isBlank();
    }
}
