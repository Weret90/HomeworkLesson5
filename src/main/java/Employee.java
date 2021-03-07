public class Employee {

    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, long phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("ФИО: %s, должность: %s, email: %s, номер телефона: %d, зарплата: %d, возраст: %d\n", name, position, email, phoneNumber, salary, age);
    }

    public int getAge() {
        return age;
    }
}
