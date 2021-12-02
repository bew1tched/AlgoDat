
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        VerketteterStapel<String> vs = new VerketteterStapel<String>();
        System.out.println("Ohne Elemente: " + vs);

        vs.push("wort1");
        System.out.println("Ein Element: " + vs);
        vs.push("wort2");
        System.out.println("2 Elemente: " + vs);
        var top = vs.top();
        System.out.println("Oberstes Element: " + top);
        vs.pop();
        System.out.println("Wieder nur ein Element: " + vs);

        VerketteterStapel<String> vs2 = new VerketteterStapel<String>();
        vs2.push("wort1");
        System.out.println("Die obersten Elemente sind gleich: " + vs2.equals(vs));
    }
}