package main.java.Model.Enemies;

public class MartianDog extends Enemy {
    public MartianDog(int locX, int locY) {
        super(locX,locY);
        moveSpd = 1;
        attack = 1;
        type  = EnemyTypeEnum.MARTIANDOG;
        image = "MartianDog.png";
        health = 100;
        name = "Martian Dog";
    }
}
