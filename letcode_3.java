//Letcode 3 ���ظ�����Ӵ�
//���������
//��������ָ�룬start��end������ǰ���ڵĿ�ʼ�ͽ�����λ�ã�ͬ������hashset,�����ڳ����ظ�ʱ��start++,û���ظ�ʱ end++;
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