import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(12, 5);
        System.out.println(result);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Addition result: " + result);
    }
}
