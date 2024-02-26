public class Bow extends Ranged {
    private int pullback;
  
    public Bow(){
      super("WOODEN BOW", 5, 20);
      pullback = 3;
    }
  
    public Bow(String name, int damage, int distance, int pullback){
      super(name, damage, distance);
      this.pullback = pullback;
    }
  
    // A subclass is usually designed to have modified (overridden) 
    // or additional methods or instance variables.
  
    public void improve(int newDamage, int newDistance, int newPback){
      // The keyword super can be used to call a superclass's constructors
      // and methods. 
  
      // The superclass method can be called in a subclass by using 
      // the keyword super with the method name and passing appropriate 
      // parameters. 
      super.improve(newDamage, newDistance);
      pullback = newPback;
    }
    
    public void fire(){
      for (int i = 0; i < super.getDist(); i++)
        System.out.print("--> ");
        System.out.println();
    }
  
    public String toString(){
      return super.toString() + ", " + pullback + " seconds to draw";
    }
  }