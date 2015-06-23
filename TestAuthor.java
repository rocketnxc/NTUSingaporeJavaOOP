package NTUSingapore.Exercise2;

/**
 * Created by Cao on 6/23/2015.
 */
public class TestAuthor {
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
    }
}
