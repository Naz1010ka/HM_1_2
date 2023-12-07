public class Mum extends Granny{
    public Mum() {
    }

    public Mum(String name, int age, Home home, Hobby hobbies) {
        super(name, age, home, hobbies);
    }

    public Mum(Home home, Hobby hobbies) {
        super(home, hobbies);
    }

    final public void saySomething() {
        System.out.println("Good morning!");
    }

    public void saySomething(String say) {
        System.out.println(say);
    }


    public String getInfo() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nHobby: " + getHobbies();
    }
}

