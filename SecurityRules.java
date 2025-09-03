package transport;
//final class cannot be extended
public final class SecurityRules {
    private SecurityRules() { 
    }
//static method to check if the drone is allowed
    public static boolean canFly(String place) {
        if(place=="ExamCell") 
            return false;
        else
            return true;
    }
}


