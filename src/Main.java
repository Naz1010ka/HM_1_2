public class Main {
    public static  void main(String[] args) {
        // objA
        Home home = new Home("Mansion", "Michurina 24");
        Mum mum = new Mum("Nurgul", 67, home, Hobby.TRAVELLING);

        System.out.println(mum.getInfo());
        mum.saySomething();
        mum.saySomething("I'm going to Rome.");

        System.out.println("\n------------");

        Home home2 = new Home("Apartment", "London");

        // objB
        Daughter daughter1 = new Daughter("Nura", 14, home, Hobby.DRAWING);

        System.out.println(daughter1.getInfo());


        System.out.println("\n------------");


        // objC
        Daughter daughter2 = new Daughter("Naiima", 20, home2, Hobby.COOKING);

        System.out.println(daughter2.getInfo());
    }
}