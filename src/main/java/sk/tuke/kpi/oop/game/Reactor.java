package sk.tuke.kpi.oop.game;
//nazov balicka

import sk.tuke.kpi.gamelib.framework.AbstractActor;
import sk.tuke.kpi.gamelib.graphics.Animation;

public class Reactor extends AbstractActor {
    private int temperature;
    private boolean state;
    private int damage;
    private Animation normalAnimation;
    private Animation hotAnimation;
    private Animation brokenAnimation;


    public Reactor() {
        this.temperature = 0;
        this.state = false;
        this.damage = 0;
        this.normalAnimation = new Animation(
            "sprites/reactor_on.png",
            80, 80,
            0.1F,
            Animation.PlayMode.LOOP_PINGPONG
        );

        this.hotAnimation = new Animation(
            "sprites/reactor_hot.png",
            80, 80,
            0.1F,
            Animation.PlayMode.LOOP_PINGPONG
        );

        this.brokenAnimation = new Animation(
            "sprites/reactor_broken.png",
            80, 80,
            0.1F,
            Animation.PlayMode.LOOP_PINGPONG
        );

        setAnimation(this.normalAnimation);
    }

    public int getTemperature() {
        return this.temperature;
    }

    public int getDamage() {
        return this.damage;
    }

    public void increaseTemperature(int increment) {
        this.temperature = this.temperature + increment;

        if(this.damage == 100)
        {
            return;
        }

        // update animation
        // if temperature is >= 6000, then broken show reactor
        if (this.temperature >= 6000) {
            setAnimation(this.brokenAnimation);

       // if (4000 <= temperature < 6000), then show hot reactor
        } else if (this.temperature >= 4000) {
            setAnimation(this.hotAnimation)

        } else {
            setAnimation(this.normalAnimation);
        }

        // update damage
        int damage = (this.temperature >= 2000){
            if(this.temperature >= 6000) {
                this.damage = 100;
            }else{
                int damage = (this.temperature / 40) - 50;
                if(this.damage < damage) {
                    this.damage = damage;
                }
            }
        }
    }
}

