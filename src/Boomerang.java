public class Boomerang extends Ranged {
    private int weight;
  
    public Boomerang(){
      super("WOOD BOOMERANG", 5, 20);
      weight = 1;
    }
  
    public Boomerang(String n, int dmg, int dist, int w){
      super(n, dmg, dist);
      weight = w;
    }
  
    public void improve(int newDamage, int newDistance, int newWeight){
      super.improve(newDamage, newDistance);
      weight = newWeight;
    }
  
    public void toss(){
      for (int i = 0; i < super.getDist(); i++)
        System.out.print(") ( ");
        System.out.println();
    }
  
    public String toString(){
      return super.toString() + ", weighs " + weight + " pounds";
    }
  }