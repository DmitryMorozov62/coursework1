public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Иванов И.И.", 1, 35_000);
        employee[1] = new Employee("Петров А.И.", 1, 80_000);
        employee[2] = new Employee("Федотова Г.М.", 2, 100_000);
        employee[3] = new Employee("Муротов Д.Д.", 2, 150_000);
        employee[4] = new Employee("Сидров В.Ф.", 3, 50_000);
        employee[5] = new Employee("Акимов П.В.", 3, 90_000);
        employee[6] = new Employee("Фирсова А.Н.", 4, 35_000);
        employee[7] = new Employee("Сивцов М.П.", 4, 40_000);
        employee[8] = new Employee("Литвинова В.Д.", 5, 200_000);
        employee[9] = new Employee("Свиридов К.М.", 5, 210_000);
        printAllPerson();
        printSum();
        printMinSalary();
        printMaxSalary();
        printAverageSalary();
        printAllNamePerson();
    }

    public static void printAllPerson() {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public static void printSum() {
        int sum = 0;
        for (Employee value : employee) {
            sum += value.salary;
        }
        System.out.println("сумма затрат на зарплаты в месяц " + sum + " рублей");
    }

    public static void printMaxSalary() {
        int maxSalary = employee[0].salary;
        for (Employee value : employee) {
            final int s = value.salary;
            if (s > maxSalary) {
                maxSalary = s;
            }
        }
        System.out.println("Максимальная зарплата " + maxSalary + " рублей");
    }

    public static void printMinSalary() {
        int minSalary = employee[0].salary;
        for (Employee value : employee) {
            final int s = value.salary;
            if (s < minSalary) {
                minSalary = s;
            }
        }
        System.out.println("Минимальная зарплата " + minSalary + " рублей");
    }
    public static void printAverageSalary() {
        int sum = 0;
        for (Employee value : employee) {
            sum += value.salary;
        }
        double average = (double)sum / employee.length;
        System.out.println("средняя зарплата " + average + " рублей");
    }

    public static void printAllNamePerson() {
        for (Employee value : employee) {
            System.out.println(value.person);
        }
    }
}

