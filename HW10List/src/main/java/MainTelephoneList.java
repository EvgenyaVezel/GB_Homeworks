import java.util.ArrayList;
import java.util.Arrays;

public class MainTelephoneList {
    public static void main(String[] args) {
        TelephoneList tl = new TelephoneList();
        tl.add("Иванов", Arrays.asList("8905122214, 895655689965"));
        tl.add("Петров", Arrays.asList("8905122214"));
        tl.add("Ахмадеева", Arrays.asList("89021478963, 89026598741"));
        tl.add("Ерохин", Arrays.asList("84955236998"));
        tl.add("Бутырина", Arrays.asList("83955633984"));
        tl.add("Арзамасова", Arrays.asList("84955866332"));

        System.out.println(tl.get("Иванов"));

       tl.viewAll();
    }
}
