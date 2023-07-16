package polymorphism;

import java.util.ArrayList;
import java.util.List;
public class EmailAddmin extends Staff{
    private List<String> emails;

    public EmailAddmin(String name, int staffId, List<String> emails) {
        super(name, staffId);
        emails = new ArrayList<>();
    }
    public List<String> getEmails(){
        return new ArrayList<>(emails);
    }
    public void addEmail(String email){
        emails.add(email);
    }
}
