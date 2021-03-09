import java.util.Scanner;

public class Employee {

    private String fio;
    private String position;
    private String mail;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;
    private int salary;
    private byte age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Scanner sc = new Scanner(System.in);
        while (age < 21) {
            System.out.println("Недопустимый возраст! Врачи могут быть только старше 21 года! Измените возраст");
            age = sc.nextByte();
        }
        this.age = (byte)age;
    }


    public Employee(String fio, String position, String mail, String phone, int salary, int age){
            this.fio = fio;
            this.position = position;
            this.mail = mail;
            this.phone = phone;
            this.salary = salary;
            setAge(age);
    }

    public void employeeInfo(Employee person){
        System.out.printf("\n Сотрудник %s\n занимает должность %s\n зарплата %d\n %d лет от роду\n email %s\n телефон %s\n ", fio, position, salary, age, mail, phone);
    }
}
