package sk.tuke.kpi.oop.game;

import sk.tuke.kpi.gamelib.framework.AbstractActor;
import sk.tuke.kpi.gamelib.graphics.Animation;

//vytvorenie triedy
public class Computer extends AbstractActor {


    public Computer() {
        Animation computer = new Animation("sprites/computer.png",
            80, 48, 0.1f, Animation.PlayMode.LOOP_PINGPONG);
        setAnimation(computer);
    }

    //metoda
    public int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    //metoda
    public float add(float operand1, float operand2) {
        return operand1 + operand2;
    }

    //metoda
    public int sub(int operand1, int operand2) {
        return operand1 - operand2;
    }

    //metoda
    public float sub(float operand1, float operand2) {
        return operand1 - operand2;
    }

}
