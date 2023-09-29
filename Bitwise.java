public class Bitwise {

     public static String decimalToBinary(int decimal)
     {
         String Binary = "";
         while (decimal != 0)
         {
             Binary = String.valueOf(decimal%2) + Binary;
             decimal = decimal/2;
         }
         return Binary;
     }

     public static String[] equaliseLength(String a, String b)
     {
         //adds 0's to the beginning of the shorter string, to make them equal length
         while(a.length() != b.length())
         {
             if(a.length() > b.length()) b = "0" + b;
             else a = "0" + a;
         }
         String[] returnBinary = {a,b};
         return returnBinary;
     }
     public static String bitwiseAnd(String a, String b)
    {
        String bitwised = "";
        String[] callEqualiseArray = equaliseLength(a,b);
        a = callEqualiseArray[0];
        b = callEqualiseArray[1];

        //each 0 and 1 is compared to a corresponding 0 or 1, if they're both 1 the resulting return is also 1
        for(int i = 0; i < a.length();i++)
        {
            if(a.charAt(i) == '1' && b.charAt(i) == '1') bitwised = bitwised + "1";
            else bitwised = bitwised + "0";
        }
        return bitwised;
    }

    public static String bitwiseOr(String a, String b)
    {
        String bitwised = "";
        String[] callEqualiseArray = equaliseLength(a,b);
        a = callEqualiseArray[0];
        b = callEqualiseArray[1];
        //each 0 and 1 is compared to a corresponding 0 or 1, if they're both 1 the resulting return is also 1
        for(int i = 0; i < a.length();i++)
        {
            if(a.charAt(i) == '1' || b.charAt(i) == '1') bitwised = bitwised + "1";
            else bitwised = bitwised + "0";
        }
        return bitwised;
    }
    public static String bitwiseXor(String a, String b)
    {
        String bitwised = "";
        String[] callEqualiseArray = equaliseLength(a,b);
        a = callEqualiseArray[0];
        b = callEqualiseArray[1];
        for(int i = 0; i < a.length();i++)
        {
            if(a.charAt(i) == b.charAt(i)) bitwised = bitwised + "0";
            else bitwised = bitwised + "1";
        }
        return bitwised;
    }
    public static int binaryToDecimal(String binaryString)
    {
        int binaryDigit = 0;
        int sumInt = 0;
        for(int i = 0; i < binaryString.length();i++)
        {
            //the nth character of the binaryString
            binaryDigit=Character.getNumericValue(binaryString.charAt(i));
            sumInt += binaryDigit* (int)java.lang.Math.pow(2,binaryString.length() - i - 1);
        }
        return sumInt;
    }

    public static void main(String[] args) {
        int a = 42;
        int b = 3;
        System.out.println(a);
        System.out.println(b);
        String binaryA = decimalToBinary(a);
        String binaryB = decimalToBinary(b);
        System.out.println(binaryA);
        System.out.println(binaryB);
        //bitwiseAnd can be switched out for bitwiseOr, or bitwiseXor
        String processedBinary = bitwiseAnd(binaryA,binaryB);
        System.out.println(processedBinary);
        System.out.println(binaryToDecimal(processedBinary));

    }
}
