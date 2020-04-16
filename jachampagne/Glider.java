package jachampagne;

public class Glider extends Vehicule 
{
    public Glider()
    {
        this.mMouvementSpeed = 28;

    }
    public void moveXY(int x, int y)
    {

        System.out.println("Le planeur fend l'air vers " + x + "," + y);
    }

    @Override
    public void fly(String energy) {
        
        System.out.println("Je me propulse dans les airs avec du " + energy);

    }


}