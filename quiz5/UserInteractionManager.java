package quiz5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInteractionManager {

    private CommunicationManager communicationManager;
    private List<ChatMessage> chatHistory;

    public UserInteractionManager() {
        this.communicationManager = new CommunicationManager();
        this.chatHistory = new ArrayList<>();
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("User: ");
            String userMessage = scanner.nextLine();

            if (userMessage.equalsIgnoreCase("exit")) {
                break;
            }

            chatHistory.add(new ChatMessage("User", userMessage));
            String response = communicationManager.sendMessage(userMessage, chatHistory);

            System.out.println("Chatbot: " + response);
            chatHistory.add(new ChatMessage("Chatbot", response));
        }

        scanner.close();
    }

    public static void main(String[] args) {
        UserInteractionManager manager = new UserInteractionManager();
        manager.startChat();
    }
}
