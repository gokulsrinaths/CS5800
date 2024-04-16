
public class MessageMememto {
    private Message message;

    public MessageMememto(Message message) {
        this.message = new Message(message.getSender(), message.getReceivers(), message.getTextMessage());
    }

    public Message getPreviousMessage() {
        return message;
    }
}
