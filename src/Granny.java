public class Granny {

        private String name;
        private int age;
        private Home home;
        private Hobby hobbies;

        public Granny() {
        }

        public Granny(String name, int age, Home home, Hobby hobbies) {
            this.name = name;
            this.age = age;
            this.home = home;
            this.hobbies = hobbies;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public Home getHome() {
            return home;
        }

        public Hobby getHobbies() {
            return hobbies;
        }


        public Granny(Home home, Hobby hobbies) {
            this.home = home;
            this.hobbies = hobbies;
        }


    }


