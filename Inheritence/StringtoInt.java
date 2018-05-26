public class StringtoInteger {
   public static void main (String args[])
    {
        String  NumberString="-123";
        int output=    stringToInteger( NumberString );
        System.out.println("int value as output "+ output);
    }
   public static int stringToInteger( String str ){
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = str.length();
        if( str.charAt(0) == '-' ){
            isNegative = true;
            i = 1;
        }
        while( i < len ){
            number *= 10;
            number += ( str.charAt(i++) - '0' );
        }
        if( isNegative )
        number = -number;
        return number;
    }   
}

