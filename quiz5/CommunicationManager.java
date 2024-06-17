package quiz5;

import java.util.List;

public class CommunicationManager {

    public String sendMessage(String currentMessage, List<ChatMessage> chatHistory) {
        // Simulate chatbot responses based on the user message
        String response = getChatbotResponse(currentMessage);
        return response;
    }

    private String getChatbotResponse(String userMessage) {
        // Simple logic to return a response based on user message
        if (userMessage.toLowerCase().contains("hello")) {
            return "Good day!";
        } else if (userMessage.toLowerCase().contains("time")) {
            return "It's 9:00 AM.";
        } else if (userMessage.toLowerCase().contains("go")) {
            return "Wait for me!";
        } else {
            return "I'm sorry, I don't understand.";
        }
    }
}
