package sk.tuke.kpi.oop.game;

//nazov balicka

import sk.tuke.kpi.gamelib.framework.AbstractActor;
import sk.tuke.kpi.gamelib.graphics.Animation;

// vytvorenie triedy
public class Hammer extends AbstractActor {
    private int usages; //vytvorenie clenskej premennej


    //vytvorenie metody - vratila aktualnu hodnotu
    public int getUsages() {
        return this.usages;
    }

    //vytvorenie konstruktora - metody na inicializaciu objektu - vola sa ako trieda

    public Hammer(){
        this.usages = 1;
        Animation animation = new Animation("sprites/hammer.png");
        setAnimation(animation);
    }

    //vytvorenie metody - zmenila hodnotu premennej o -1 pri kazdom pouziti a nakoniec kladivo zmizne
    public void use() {
        this.usages--;
        if (this.usages == 0){
            getScene().removeActor(this);
        }
    }

}
