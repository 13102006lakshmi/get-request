
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GetRequest {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
        HttpURLConnection con =
            (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");

        Scanner sc = new Scanner(con.getInputStream());

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
        con.disconnect();
    }
}
