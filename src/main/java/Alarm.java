public class Alarm {

    public static String getCapacityStatus(int numberOfPeople) {
        if (numberOfPeople > 30) {
            return "Too many people";
        }
        return "Maximum number of people not exceeded";
    }
}
