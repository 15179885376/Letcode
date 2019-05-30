/**
 * @author Zzy
 * @create 2019  30  15:38
 * @desc
 **/
public class letCode_5 {
    public static void main(String[] args) {
        String s="cbbd";
        System.out.println(huiwen(s));
    }
    public static String huiwen(String s){
        int begin=0;
        int max=0;
        int n=s.length();
        if(n==1){
            return s;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(isTrues(s.substring(i,j+1))){
                    if((j-i+1)>max){
                        max=j-i+1;
                       begin=i;
                    }
                }
            }
        }
        return s.substring(begin,begin+max);
    }
    public static boolean isTrues(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        String str=sb.reverse().toString();
        if(s.equals(str)){
            return true;
        }
        return false;
    }
}
