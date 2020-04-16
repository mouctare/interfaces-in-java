package jachampagne;

public class Cottage  extends Bulding  implements Flyable
{
    public Cottage()
    {
        System.out.println("Parcelle en place...");
    }
    
       
	@Override
	void bulding(String material) {
        System.out.println("Construction du batiment en " + material);
    }

    @Override
    public void fly(String energy) 
    {
        
        System.out.println("Je me propulse dans les airs avec du " + energy);

    }
	
	}

