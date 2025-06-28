package Exercises;

public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true, 37);
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }
    }
}

// Alternatively (better approach)
// public class PlayingCat {

//     public static boolean isCatPlaying(boolean summer, int temperature) {

//         int max = summer ? 45 : 35;
//         return temperature >= 25 && temperature <= max;
//     }
// }
