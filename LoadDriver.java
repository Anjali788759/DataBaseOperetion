package DataBaseOperetion;

public class LoadDriver {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver lode");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
