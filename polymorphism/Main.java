package polymorphism;

public class Main {
    public static void main(String[] args) {
        //polymorphism.Editor nasko = new polymorphism.Editor("Nasko",1,23);
        //polymorphism.User ivan = new polymorphism.Editor("Ivan", 2,33);
        /*polymorphism.User user = new polymorphism.User("Tosho");
        System.out.println(user.identify());
        System.out.println(user);
        System.out.println(user.toString());
        polymorphism.Staff georgi = new polymorphism.Staff("Georgi", 3);
        System.out.println(georgi.identify());
        System.out.println(georgi.toString());*/

        User[] users = generateListOfUsers();
        for (User user: users) {
            System.out.println(user);
            System.out.println("###");
        }
        for (User user: users) {
            System.out.println(user.identify());
        }
    }

    private static User[] generateListOfUsers() {
        return new User[]{
                new User("Ivan"),
                new Staff("Georgi", 1),
                new Editor("Pesho", 2,23)
        };
    }
}