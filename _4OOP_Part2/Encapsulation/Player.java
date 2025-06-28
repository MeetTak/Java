package _4OOP_Part2.Encapsulation;

public class Player {

    public String fullName;// changing fields name from name to fullName and the other problem is, basically we had to update the variables in the Main class as well.
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {

        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
