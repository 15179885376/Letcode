import java.util.ArrayList;
import java.util.List;

/**
 * @author Zzy
 * @create 2019  04  12:37
 * @desc
 **/

/*
给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。

示例:
输入："23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

* */
public class Letcode_17 {
    public static void main(String[] args) {
        String num = "233";
        List<String> list = new ArrayList<>();
        list = text1(num);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> test(String num) {
        List<String> list = new ArrayList<>();
        if (num.length() == 0)
            return list;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        list.add("");
        System.out.println(list.get(0).length());
        int id = 0; //保存数字信息
        String temp = null;
        for (int i = 0; i < num.length(); i++) {
            id = Integer.parseInt(num.charAt(i) + "");
            while (list.get(0).length() == i) {
                temp = list.remove(0);//巧妙
                for (int j = 0; j < mapping[id].length(); j++) {
                    list.add(temp + mapping[id].charAt(j));
                }
            }
            /*for(int j=0;j<mapping[id].length();j++){
                list.add(temp+mapping[id].charAt(j));
            }*/
        }
        return list;
    }
    public static List<String> text1(String num) {
        List<String> list = new ArrayList<>();
        if (num.length() == 0)
            return list;
        huisu("", num, 0, list);
        return list;
    }

    public static void huisu(String s, String digit, int index, List<String> list) {
        //终止条件，如果已经遍历玩
        if (index >= digit.length()) {
            list.add(s);
            return; //回溯
        }
        String[] strings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String chars = strings[digit.charAt(index) - '0'];
        //遍历一个数字所对应的所有字母
        for (int i = 0; i < chars.length(); i++) {
            huisu(s + chars.charAt(i), digit, index + 1, list);
            //如需要复位则可能需要list.remove()..
        }
    }
}
