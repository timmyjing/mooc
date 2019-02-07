
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        
        if (getClass() != object.getClass()) {
            return false;
        }
        
        RegistrationPlate other = (RegistrationPlate) object;
        
        if (regCode == null || !regCode.equals(other.regCode)) {
            return false;
        }
        
        if (country == null || !country.equals(other.country)) {
            return false;
        }
       
        return true;
    }
    
    public int hashCode() {
        int result = 0;
        
        if (regCode == null) {
            result += 7;
        } else {
            result += regCode.hashCode();
        }
        
        if (country == null) {
            result += 13;
        } else {
            result += country.hashCode();
        }
        
        return result;
    }

}
