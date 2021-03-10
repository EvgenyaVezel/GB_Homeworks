public class Work {

    public static void main(String[] args) {
        Employee person1 = new Employee("Иванов Илья Владимирович", "Хирург", "IvanovIV@mail.ru", "84958632321", 70000, 20);
        person1.employeeInfo();

        Employee[] personMass = new Employee[5];

        personMass[0] = new Employee("Петрова Ксения Сергеевна", "Мед.сестра", "PetrovaKS@mail.ru", "89021869532", 50000, 21);
        personMass[1] = new Employee("Ковалева Софья Михайловна", "Педиатр", "KovalevaSM@mail.ru", "899985632145", 68145, 42);
        personMass[2] = new Employee("Аристов Илья Иванович", "Дерматолог", "AristII@mail.ru", "89998563621", 86000, 50);
        personMass[3] = new Employee("Копытов Николай Николаевич", "Терапевт", "KopytovNN@mail.ru", "8999986255", 56230, 34);
        personMass[4] = new Employee("Петрова Ксения Сергеевна", "Хирург", "PetrovaKS@mail.ru", "89028963215", 75200, 26);

        System.out.println();
        System.out.println("Сотруники старше 40 лет:");
        for (int i = 0; i < personMass.length; i++) {

            if(personMass[i].getAge() >40){
                personMass[i].employeeInfo();
            }

        }
    }
}
