//Letcode 3 无重复的最长子串
//问题分析：
//定义两个指针，start和end，代表当前窗口的开始和结束的位置，同样适用hashset,当窗口出现重复时，start++,没有重复时 end++;
public calss solution{
        public int lengthOfLongestSubString(String s){
                 int start=0;
   int end=0;
   int n=s.length();
   int res=0;
    Set<character> set=new HashSet<>;
while(start<n && end <n){
    if(set.contains(s.charAt(end))
          set.remove(s.charAt(start++));
    else{
      set.add(s.charAt(end++));
       res=math.Max(end-start);
}
}
return res;
}
}