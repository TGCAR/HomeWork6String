public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();
        System.out.println("Task 2");
        System.out.println();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        System.out.println();
        System.out.println("Task 3");
        System.out.println();
        firstName = firstName.replace("Ivan", "Семен");
        middleName = middleName.replace("Ivanovich", "Семенович");
        lastName = lastName.replace("Ivanov", "Иванов");
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName);
    }
}