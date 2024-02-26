public class Weapon{
  
    private String name;
    private int damage;
    private boolean poisoned;
  
    public Weapon(){
      name = "WEAPON";
      damage = 0;
      poisoned = false;
    }
  
    public Weapon(String n, int d){
      name = n.toUpperCase();
      damage = d;
      poisoned = false;
    }
  
    public void poison(){
      damage += 5;
      poisoned = true;
    }
  
    public void improve(int newDamage){
      damage = newDamage;
    }
  
    public String toString(){
      String poison = ": ";
      if (poisoned) poison = " (poisoned): ";
      return name + poison + damage + " damage";
    }
    
  }