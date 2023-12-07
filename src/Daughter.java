public class Daughter extends Mum{
    public Daughter(String name, int age, Home home, Hobby hobbies) {
        super(name, age, home, hobbies);
    }


    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nHome: " + getHome().getName() +
                "\nHome: " + getHome().getAddress();
    }

}
