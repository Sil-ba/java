package sk.tuke.kpi.oop.game;
//nazov balicka

import sk.tuke.kpi.gamelib.framework.AbstractActor;
import sk.tuke.kpi.gamelib.graphics.Animation;

public class Reactor extends AbstractActor {
    private int temperature;
    private boolean state;
    private int damage;
    private Animation normalAnimation;
    public Reactor(){
        temperature = 0;
        state = false;
        damage = 0;
        normalAnimation = new Animation(
            "sprites/reactor_on.png",
            80,80,
            0.1F,
            Animation.PlayMode.LOOP_PINGPONG
        );


        setAnimation(normalAnimation);
    }

    public int getTemperature(){
        return temperature;
    }

    public int getDamage(){
        return damage;
    }

    public void increaseTemperature(int increment){

    }
}