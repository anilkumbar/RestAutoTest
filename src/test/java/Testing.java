import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing implements Add{

    public static void main(String[] args) {

        String s1="ANILkum1234";
        String s2="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$";
       // System.out.println(s1==s2);
      //  System.out.println(s1.equals(s2));
     //   Pattern pattern=Pattern.compile("[a-z]{7}");
    //    Matcher matcher=pattern.matcher(s1);
      //  boolean b=matcher.matches();
  //      System.out.println(b);
        String reg= "^([A-Z]+)"+"([a-z]+)"+"([0-9]+)";

        System.out.println(Pattern.matches(reg,s1));

        int arr[]={1,2,3,2,2,4,5,3};
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
            if (arr[i] == arr[j]) {
                System.out.println(arr[i]);
            }
        }
        }
        Testing.findIt("javaprogramming");

    }

    public static void findIt(String str) {
    Map<Character, Integer>  map=new HashMap<Character,Integer>();
        char ch[]=str.toCharArray();
        for(Character c:ch)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            if(m.getValue()>1)
            {
                System.out.println(m.getKey()+"  "+m.getValue());
            }
        }

        String s1="anilkumbar";
        for(int i=s1.length()-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));
        }
        StringBuffer sb=new StringBuffer();
        sb.append(s1);
     //   System.out.println(sb.reverse());


    }
}
