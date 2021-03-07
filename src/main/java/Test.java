public class Test {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Иванов И.И.", "инженер", "ivanov@mail.ru", 89995436566L, 30000, 28);
        emp[1] = new Employee("Еремеев А.Е.", "фельдшер", "eremeev@mail.ru", 89246750000L, 25000, 45);
        emp[2] = new Employee("Петрова О.О.", "секретарша", "petrova@mail.ru", 89147772525L, 32000, 20);
        emp[3] = new Employee("Краснов Е.Л.", "программист", "krasnov@mail.ru", 89654567898L, 40000, 51);
        emp[4] = new Employee("Ленин В.И.", "директор", "redrevolution@mail.ru", 80708111917L, 75000, 54);

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > 40) {   // так как поля приватны, то использую геттер для получения возраста
                emp[i].getInfo();
            }
        }

    }
}
