package jenkins.plugins.wulitou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GB2UTF
{
public static String GBK2Unicode(String str)
{
StringBuffer result = new StringBuffer();
for (int i = 0; i < str.length(); i++)
{
char chr1 = (char)str.charAt(i);
if(!isNeedConvert(chr1))
{
result.append(chr1); 
continue;
}
result.append("&#x" + Integer.toHexString((int)chr1) + ";"); 
}
return result.toString();
}

public static boolean isNeedConvert(char para)
{
return ((para&(0x00FF))!=para);
}

public static String GBK2Unicode2(String str)
{
StringBuffer result = new StringBuffer();
for (int i = 0; i < str.length(); i++)
{
char chr1 = (char)str.charAt(i);
result.append("&#" + Integer.toString((int)chr1)+ ";"); 
} 
return result.toString();
}

    public static String toUTF8(String input){
    return GBK2Unicode(input);
    }

public static void main(String[] args) 
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = "我9岁博览群书，20岁到达顶峰， 往前300年往后推300年， 没有人会超过我，在智力上他们是不可能比我强的 那就在身高和外貌上弥补吧.";
    System.out.println(GBK2Unicode(str));
    System.out.println(GBK2Unicode2(str));

}
}