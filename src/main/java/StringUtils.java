import java.util.Arrays;
import java.util.List;

public class StringUtils {
    /**
     * 按照:' '|','|'、'拆分成List
     *
     * @param str
     * @return list
     */
    public static List<String> formatOne(String str) {
        List<String> list = Arrays.asList(str.split(" |,|、"));
        //验证
        //System.out.println(list);
        return list;
    }
    public static List<String> formatOne(String str,String match) {
        List<String> list = Arrays.asList(str.split(match));
        //验证
        //System.out.println(list);
        return list;
    }
}
