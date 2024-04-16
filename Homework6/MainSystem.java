import java.util.Iterator;
import java.util.List;

public class MainSystem {
    private static final ChatServer chatServer = new ChatServer();

    public static void main(String[] args) {
        //creating 4 users and adding them to system
        User roomfrnd1 = new User("Gokul", chatServer);
        User roomfrnd2 = new User("Srinath", chatServer);
        User roomfrnd3 = new User("Seetha", chatServer);
        User roomfrnd4 = new User("Ram", chatServer);
        System.out.println("\n===== User's Created =====");


        // Sending some messages
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd2), "Hey, Srinath! What's for dinner tonight?"));
        chatServer.sendMessage(new Message(roomfrnd4, List.of(roomfrnd2), "Hi Srinath, how's your headache?"));
        chatServer.sendMessage(new Message(roomfrnd2, List.of(roomfrnd4), "Hey Ram, my headache's worse."));
        chatServer.sendMessage(new Message(roomfrnd4, List.of(roomfrnd1), "Gokul, thanks for not asking what I want to eat."));
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd3), "Hi Seetha, chicken tonight?"));
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd4), "Sorry Ram, what do you want to eat?"));
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Hey Gokul, no chicken for me."));
// Demonstrating blocking
        roomfrnd2.blockerUsers(roomfrnd1);
// Sending a message after blocking
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd2, roomfrnd3), "Seetha, cheesecake factory?"));
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Why cheesecake factory?"));
// Demonstrating unsending
        chatServer.undoLastMessage(roomfrnd3);
        System.out.printf("Seetha's last message: '%s'\n", roomfrnd3.getChatHistory().getLastSentMessages());
        chatServer.undoLastMessage(roomfrnd2);
// Iterating over chat history
        System.out.println("Seetha's chat history:");
        Iterator<Message> allMessagesIterator = roomfrnd3.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.println("Gokul's chat history:");
        allMessagesIterator = roomfrnd1.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.println("Ram's chat history:");
        allMessagesIterator = roomfrnd4.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
// Unregistering a user and trying to send a message
        chatServer.unregisterUser(roomfrnd1);
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "I want cheesecakes from there."));

    }
}