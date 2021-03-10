import java.util.Scanner;

public class Employee {

    private String fio;
    private String position;
    private String mail;
    private String phone;
    private int salary;
    private byte age;
    public String getPhone() {
        return phone;
    }

    public Employee(String fio, String position, String mail, String phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        setAge(age);
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 21) {
            System.out.println("Недопустимый возраст! Врачи могут быть только старше 21 года!");
        }
        this.age = (byte)age;
    }




    public void employeeInfo(){
        System.out.printf("\n Сотрудник %s\n занимает должность %s\n зарплата %d\n %d лет от роду\n email %s\n телефон %s\n ", fio, position, salary, age, mail, phone);
    }
}
