import java.util.Random;

public class otp 
{
    public String o()
    {
        String number = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[4];
        for (int j = 0; j < 4; j++)
        {
            otp[j] = number.charAt(rndm_method.nextInt(number.length()));
        }
        String o1 = String.valueOf(otp);
        return o1;
    }
    
}
