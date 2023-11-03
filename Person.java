//person class

public class Person {
        private int id;
        private String name;
        private int age;
        private final boolean parentPermission;

    public  Person(String name, int age, boolean parentPermission) {

            this.name = name;
            this.age = age;
            this.parentPermission = parentPermission;
        }

        public Person(String name,int age) {
            this( "unknown", age, true);
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {

        return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private boolean isOfAge() {

            return age >= 18;
        }

        public boolean canUseServices() {
            return isOfAge() || parentPermission;
        }
    }


