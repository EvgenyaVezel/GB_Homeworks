import java.util.ArrayList;
import java.util.Arrays;

public class MainTelephoneList {
    public static void main(String[] args) {
        TelephoneList tl = new TelephoneList();

        tl.add("Иванов", "8904122568923");
        tl.add("Иванов", "8904122569875");
        tl.add("Ерохин", "84955236998");
        tl.add("Бутырина", "83955633984");
        tl.add("Арзамасова","84955866332");
        tl.add("Ерохин","89994221446");
        tl.add("Ерохин","89994221446");

        System.out.println(tl.get("Иванов"));

       tl.viewAll();
    }
}
