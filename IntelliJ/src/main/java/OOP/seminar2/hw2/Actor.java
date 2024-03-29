package OOP.seminar2.hw2;

import OOP.seminar2.cw1.ActorBehaviour;

public abstract class Actor implements ActorBehaviour {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public abstract String getName();

    public Actor(String name) {
        this.name = name;
    }
}

