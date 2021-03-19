public class MainClass {

    public static void main(String[] args) {

        Move[] party = {new Robot(2.3, 150.5, "Робо"),
                new Robot(1.0, 150.5, "Макинтош"),
                new Cat(2.0, 500.0, "Мурзик"),
                new Human(1.5, 600, "Валерий")};


        Let[] lets = {new Wall(1.2), new Wall(2), new Treadmill(200.5), new Treadmill(100.5)};

        Move[] loose = new Move[party.length];


        for (int i = 0; i < party.length; i++) {
            for (int j = 0; j < lets.length; j++) {

                if(lets[j] instanceof Wall && !lets[j].goLet(party[i], party[i].getMaxJump())){
                    System.out.printf("%s,не смог перепрыгнуть через %s. Препятствие не пройдено\n", party[i].toString(), lets[i].toString());
                    break;
                }
                else if (lets[j] instanceof Treadmill && !lets[j].goLet(party[i], party[i].getMaxRun())){
                    System.out.printf("%s,не смог пробежать %s. Препятствие не пройдено\n", party[i].toString(), lets[i].toString());
                    break;
                }
            }
            System.out.println();
        }

    }
}
