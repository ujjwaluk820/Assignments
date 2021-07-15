package Capg;
import java.util.ArrayList;
import java.util.List;
class OddLengths{
    public static void main(String[] args) {
    List<String> str = new ArrayList<String>();
    str.add("Dog");
    str.add("Cat");
    str.add("Lion");
        System.out.println(str);
    str.removeIf((String s) -> s.length() %2 != 0 );
        for (String s: str) {
            System.out.println(s);
        }
        System.out.println(str);
    }
}