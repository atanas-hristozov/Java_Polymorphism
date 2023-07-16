package polymorphism.Casting;

import polymorphism.Editor;
import polymorphism.Staff;
import polymorphism.User;

public class ReferenceCasting {
    public static void main(String[] args) {
        User[] users = new User[]{
                new Staff("Georgi", 1),
                new Editor("Pesho", 2, 23),
        };
        for (User user:users) {
            ((Editor) user).getNumberOfArticles();
        }
    }
}
