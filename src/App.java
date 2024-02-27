class App {
  public static void main(String[] args) {

    Weapon weapon = new Weapon();
    Weapon ranged = new Ranged();
    Ranged rock = new Ranged("ROCK", 1, 10);
    Weapon bow = new Bow();
    Bow ashBow = new Bow("ASH BOW", 25, 50, 2);
    Weapon boom = new Boomerang();
    Boomerang bigBoom = new Boomerang("BIG BOOMERANG", 20, 25, 3);

    System.out.println(weapon);
    System.out.println(ranged);
    System.out.println(rock);
    System.out.println(bow);
    System.out.println(ashBow);
    System.out.println(boom);
    System.out.println(bigBoom);

    // Any method that is called must be defined in its own class
    // or superclass.
    /*
    weapon.improve(5);
    ranged.improve(10);
    // ranged.improve(15, 10);
    rock.improve(5);
    rock.improve(5, 20);

    // A subclass will inherit all public methods from the superclass;
    // these methods remain public in the subclass.
    weapon.poison();
    bow.poison();
    ashBow.poison();
    bigBoom.poison();
    ashBow.improve(30, 75);
    ashBow.improve(30, 75, 1);

    System.out.println("**************************************************");
    System.out.println(weapon);
    System.out.println(ranged);
    System.out.println(rock);
    System.out.println(bow);
    System.out.println(ashBow);
    System.out.println(boom);
    System.out.println(bigBoom);
    */
    /* 
    // bow.fire();
    ashBow.fire();
    // boom.toss();
    bigBoom.toss();
    */
  }
}