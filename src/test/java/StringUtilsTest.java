import org.example.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringUtilsTest {
    @Test
    public void formatOne() {
        List<String> list = StringUtils.formatOne("Motor system, nervous system, endocrine system, circulatory system, respiratory system, digestive system, urinary system, reproductive system");
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void formatOne2() {
        List<String> list = StringUtils.formatOne("Motor system, nervous system, endocrine system, circulatory system, respiratory system, digestive system, urinary system, reproductive system", ", ");
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void subString() {
        List<String> list = StringUtils.subString("第11集 魅力大改造,第12集 最佳女主角,第13集 今天不是父亲节,第14集 断网 所以穿越,第15集 不能说的秘密,第16集 剩女总动员,第17集 海螺姑娘,第18集 Big Boss,第19集 我 百万富翁（上）,第20集 我 百万富翁（下）",",");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
