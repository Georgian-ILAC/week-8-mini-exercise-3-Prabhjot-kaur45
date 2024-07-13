public class Person {
    private String firstName;
    private String lastName;
    protected double height;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

 class Employee extends Person {
    private int id;
    private double hourlyPay;

    public Employee(String firstName, String lastName, int id, double hourlyPay) {
        super(firstName, lastName);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    // Getters and setters for id and hourlyPay
    public int getId() {
        return id;
    }

     public double getHourlyPay() {
         return hourlyPay;
     }

    public double getRaise() {
        hourlyPay *= 1.15;
        return hourlyPay;
    }

    public double payDay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularHours = Math.min(hoursWorked, 40);
        double overtimePay = overtimeHours * hourlyPay * 1.5;
        double regularPay = regularHours * hourlyPay;
        return overtimePay + regularPay;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Hourly Pay: $" + hourlyPay + "\n" +
                "Employee ID: " + id;
    }
}




