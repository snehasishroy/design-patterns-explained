package ChainOfResponsibility;

public class EmployeeIdValidator extends Validator {
    @Override
    public boolean isValid(Employee employee) {
        System.out.println("Running Employee ID Validator");
        if (nextValidator == null) {
            return isIdValid(employee.employeeId());
        } else if (isIdValid(employee.employeeId())) {
            return nextValidator.isValid(employee);
        } else {
            System.out.println("Employee ID is invalid");
            return false;
        }
    }

    private boolean isIdValid(int id) {
        return id != 0;
    }
}
