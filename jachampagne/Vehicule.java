package jachampagne;

abstract public class Vehicule implements Flyable

{

    protected int mMouvementSpeed;

    abstract public void moveXY(int x, int y);

}