package Kyle;

public class CTamLib {
    public static boolean isPalindrome(String str)
    {
        String temp = "";
        int x = 1;
        int y = 0;
        while (temp.length()<str.length())
        {
            temp = temp + str.substring(str.length()-x,str.length()-y);
            x++;
            y++;
        }
        if (temp.equals(str))
            return true;
        else
            return false;
    }

    public static String dateStr(String str)
    {
        String month = str.substring(0,2);
        String date = str.substring(3,5);
        String year = str.substring(6,10);
        return (date + "-" + month + "-" + year);
    }

    public static int sumUpTo(int x)
    {
        int y = 0;
        int total = 0;
        while (y <= x)
        {
            total = total + y;
            y++;
        }
        return total;
    }

}
