import org.junit.jupiter.api.Test;

import java.util.List;

public class StringUtilsTest {
    @Test
    public void formatOne(){
        List<String> list = StringUtils.formatOne("Motor system, nervous system, endocrine system, circulatory system, respiratory system, digestive system, urinary system, reproductive system");
        for (String s : list) {
            System.out.println(s);
        }
    }
    @Test
    public void formatOne2(){
        List<String> list = StringUtils.formatOne("Motor system, nervous system, endocrine system, circulatory system, respiratory system, digestive system, urinary system, reproductive system",", ");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
