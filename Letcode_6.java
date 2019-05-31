/**
 * @author Zzy
 * @create 2019  31  12:01
 * @desc
 **/

/*
   LeetCode(6) ---- ZigZag Conversion
   给定一个字符串，使它按照Z字型排列（说起来应该是一个倒N字形吧），这个Z字形的大小由传入的参数决定，然后我们应该返回一个顺序读的字符串。
   访问添加第一个字符，按照V型公式位移j，判断位移后的j的合法性，
   而且需要判断是否是转折点（因为我们刚才说假设转折点两个重复数据的情况，
   这里只需要添加一个才能满足题意），合法后添加字符串，接着按照倒V型公式位移j，
   直到字符串遍历完成。

 */
public class Letcode_6 {
    public static void main(String[] args) {
             String s="12345678910";
        System.out.println(convert1(s,3));
    }
    public static String convert(String s,int numRows){
        int j=0;
        if(numRows==1)
            return s;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
                j=i;
                while(j<s.length()){
                    sb.append(s.charAt(j));
                    j+=2*(numRows-i+1);
                    if(i!=numRows-1 && i!=0 && j<s.length()-1){
                        sb.append(s.charAt(j));
                    }
                    j+=2*i;
                }
        }
        return sb.toString();
    }
    public static String convert1(String s ,int numsRows){
        int n=s.length();
        String res="";
        if(numsRows==1)
            return s;
        StringBuffer[] sb=new StringBuffer[numsRows];
        for(int i=0;i<numsRows;i++){
            sb[i]=new StringBuffer();
        }
        int j=0;
        while(j<n){
            for(int index=0;index<numsRows && j<n ;index++){
                  sb[index].append(s.charAt(j++));
            }
            for(int index=numsRows-2; index>=1 && j<n ;index--){
                sb[index].append((s.charAt(j++)));
            }
        }

        for(int i=0;i<numsRows;i++)
        {
              res+=sb[i];
        }
        return res;
    }
}
