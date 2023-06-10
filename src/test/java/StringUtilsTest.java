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
        List<String> list = StringUtils.subString("第14集 无聊的周末,第15集 派对惊魂夜,第16集 大仲马,第17集 长舌妇,第18集 你是坏人,第19集 情人节前奏曲,第20集 谁动了我的情人节",",");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
