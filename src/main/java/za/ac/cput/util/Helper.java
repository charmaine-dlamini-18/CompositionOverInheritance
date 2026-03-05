
package za.ac.cput.util;
import org.apache.commons.validator.routines.EmailValidator;
import za.ac.cput.domain.Address;

public class Helper {

    public static boolean isValid(String email){
        EmailValidator validator = EmailValidator.getInstance();

        return validator.isValid(email);
    }

    public static boolean isNullOrEmpty(String anyString){
        if (anyString == null || anyString.equals("")){
            return true;
        }
        return false;


    }
    public static boolean isNull(Object object){
        if (object == null || object.equals("")){
            return true;
        }
        return false;

    }

}

