package org.example;

import java.util.ArrayList;
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

    public static List<String> formatOne(String str, String match) {
        List<String> list = Arrays.asList(str.split(match));
        //验证
        //System.out.println(list);
        return list;
    }

    /**
     * 功能描述：
     * 将 转xabx cde,xabx cde,xabx cde
     * 转化为：ab cde \n ab cde \n ab cde
     */
    public static List<String> subString(String str, String match) {
        List<String> list = Arrays.asList(str.split(match));
        List<String> result = new ArrayList<>();
        for (String s : list) {
            StringBuffer buffer = new StringBuffer();
            int index = s.indexOf(" ");
            String left = s.substring(1, index - 1);
            String right = s.substring(index + 1);

            buffer.append(left);
            buffer.append(" ");
            buffer.append(right);
            result.add(buffer.toString());
        }
        return result;
    }
}
