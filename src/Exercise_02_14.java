public class Exercise_02_14 {
    public static void main(String[] args) {
        int day = 3, month = 4, year = 2018;
        System.out.println("Date: " + day + "/" + month + "/" + year);
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month==12) {
                if (day < 31) {
                    day++;
                }
                else if (day == 31) {
                    day = 1;
                    if (month < 12) {
                        month++;
                    }
                    else if (month == 12) {
                    month = 1;
                        year++;
                    }
                }
            }
            else if (month == 4 || month == 6 || month == 9 || month == 10 || month == 11) {
                if (day < 30) {
                    day++;
                }
                else if (day == 30) {
                    day = 1;
                    month++;
                }
                else if(day == 31){
                    System.out.println("ERROR: The " + month + " hasn't " + day + " days");
                }
            }
            else if (month == 2 && day < 29) {
                 if (day < 28) {
                    day++;
                }
                else if (day == 28) {
                    day = 1;
                    month++;
                }
            }
            else if (month == 2 || day > 29) {
                System.out.println("Error: the month 2 hasn't more than 29 days");
            }
        System.out.println("NEW Date: " + day + "/" + month + "/" + year);

    }
}