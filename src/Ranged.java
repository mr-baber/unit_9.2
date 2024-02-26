public class Ranged extends Weapon {
  
    private int distance;
  
    // The following default constructor is unnecessary in its current configuration
    public Ranged(){
      // NOTE: There is an implied call to super() here.
      distance = 0;
    }
    
    public Ranged(String n, int dmg, int dist){
      super(n, dmg);
      distance = dist;
    }
  
    // Method overriding occurs when a public method in a 
    // subclass has the same method signature as a public 
    // method in the superclass. 
    public int getDist(){
      return distance;
    }
    
    public void improve(int newDamage, int newDistance){
      super.improve(newDamage);
      if (newDistance != 0) distance = newDistance;
    }
  
    public String toString(){
      return super.toString() + ", effective up to " + distance + " feet";
    }
  }