package jachampagne;

public class Ship extends Vehicule {

public Ship(){
    this.mMouvementSpeed = 16;
    
}
public void moveXY(int x, int y)
{
    System.out.println("Le navire brasse les flots et se deplace en  " + x + " , " + y);

}

@Override
public void fly(String energy) 
{
    System.out.println("Je me propulse dans les airs avec du " + energy);
    

}

}