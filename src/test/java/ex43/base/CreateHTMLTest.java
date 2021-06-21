package ex43.base;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateHTMLTest {
    @Test
    @DisplayName("Fancy Web Name, Fancy Author")
    public void createHTML_works() {
        CreateHTML c = new CreateHTML();
        String webName = "Fancy Web Name";
        String author = "Fancy Author";

        String str = c.createHTMLtext(webName, author);
        String exp = "<html>" +
                "<head>" +
                "<title>Fancy Web Name</title>" +
                "<meta>Fancy Author</meta>" +
                "</head>" +
                "<body></body>" +
                "</html>";
        assertEquals(exp, str);
    }
}
