package Units;

public class EnemySoldier implements  Enemy {

    int healthPoints;
    int movementSpeed;

    public EnemySoldier() {
        healthPoints = 25;
        movementSpeed = 50;
    }

    @Override
    public void attackBase() {

    }

    @Override
    public void die() {
        
    }
}
