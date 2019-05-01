import java.io.File;

public class Main {

    public static void main(String[] args) {
        File firstFile = new File("product1.txt");
        File sec = new File("product2.txt");
        sec.renameTo(firstFile);
    }
}
