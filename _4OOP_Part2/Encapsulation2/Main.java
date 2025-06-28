package _4OOP_Part2.Encapsulation2;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();// problem3
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;// problem1 bcoz we can access the health field directly.
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Intial health is " + tim.healthRemaining());
    }
}
