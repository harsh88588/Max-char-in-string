import java.util.Scanner;

public class MaxChar {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);

        String s = sc.next ();
        int lngth = s.length ();
        s = s.toLowerCase();

        int maxchar = 1;
        int charpos = 0;

        for (int i = 0; i < lngth; i++)
        {
            int count = 0;
            for (int j = i; j < lngth; j++)
            {
                if (s.charAt (i) == s.charAt (j))
                {
                    count++;
                    if (maxchar < count)
                    {
                        charpos = i;
                        maxchar = count;
                    }
                }


            }

        }
        System.out.println ("Maximum number of "+s.charAt(charpos)+" is "+maxchar);
    }
}
