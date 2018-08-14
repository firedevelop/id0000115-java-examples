public class Exercise_Proposed_01_06 {
    private static final int MINUTES_IN_AN_HOUR = 60;
    private static final int SECONDS_IN_A_MINUTE = 60;

    public static void main(String[] args) {
        int seconds = 10000;
        System.out.println(timeConversion(seconds));
    }
    private static String timeConversion(int totalSeconds) {
        // hours=10000/60/60=2
        int hours = totalSeconds / MINUTES_IN_AN_HOUR / SECONDS_IN_A_MINUTE;
        // minutes=10000-(2*60*60)/60=46
        int minutes = (totalSeconds - (hoursToSeconds(hours))) / SECONDS_IN_A_MINUTE;
        // seconds=10000-(7200)+(46*60)=40
        int seconds = totalSeconds - ((hoursToSeconds(hours)) + (minutesToSeconds(minutes)));
        return hours + " hours " + minutes + " minutes " + seconds + " seconds";
    }
    private static int hoursToSeconds(int hours) {
        return hours * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE;
    }
    private static int minutesToSeconds(int minutes) {
        return minutes * SECONDS_IN_A_MINUTE;
    }
}
