import java.util.*;
public class numbertowords {



        public static String numbertowords(int a) {
            int onesword,c,tensword,e,hundredsword,thousandsword;
            onesword=a%10;
            c=a/10;
            tensword=c%10;
            e=a/100;
            hundredsword=e%10;
            thousandsword = a/1000;
            String str = "";
            String[] ab = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
            String[] tntotwnty = {"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
            String[] tens = { "","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
            String hund = " hundred  ";
            String thousand =" thousand ";
            if(a<20)
                str=ab[a];
            else
            if(a<100)
                str=tens[tensword]+ab[onesword];
            else
            if(a>99&&tensword==1)
                str = ab[hundredsword]+hund+tntotwnty[onesword];
            else
            if(a<1000)
                str=ab[hundredsword]+hund+tens[tensword]+" "+ab[onesword];
            else
            if(a>999&&tensword==1)
                str =ab[thousandsword]+thousand+ab[hundredsword]+hund+tntotwnty[onesword];
            else
            if(a>999)
                if(hundredsword==0)
                    str = ab[thousandsword]+thousand+ab[hundredsword]+tens[tensword]+" "+ab[onesword];
                else
                    str = ab[thousandsword]+thousand+ab[hundredsword]+hund+tens[tensword]+" "+ab[onesword];
            return str;
        }
        public static void main(String[] args) {
            System.out.println("Enter any number upto 4 digits:");
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            System.out.println(numbertowords(num));
        }
    }








