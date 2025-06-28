package _3controlFlow;

public class Main2 {
    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        //enhanced switch expression
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
        //     default -> throw new IllegalArgumentException("Unexpected value: " + month);
        default -> {
            String badResponse = month + " is bad";
            yield badResponse;
        }
        };
        //taditional switch expression
        // switch(month){
        //     case "JANUARY":
        //     case "FEBURARY":
        //     case "MARCH":
        //         return "1st";
        //     case "APRIL":
        //     case "MAY":
        //     case "JUNE":
        //         return "2nd";
        //     case "JULY":
        //     case "AUGUST":
        //     case "SEPTEMBER":
        //         return "3rd";
        //     case "OCTOBER":
        //     case "NOVEMBER":
        //     case "DECEMBER":
        //         return "4th";
        // }
        // return "bad";
    }
}

