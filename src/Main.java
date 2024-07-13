public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Prabh", "kaur", 58,19);

        System.out.println(employee);

        employee.getRaise();
        System.out.println("New hourly pay after raise: $" + employee.getHourlyPay());

        double totalPay = employee.payDay(45);
        System.out.println("Total pay for the week: $" + totalPay);
    }
}