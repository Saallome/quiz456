package quiz6;

import java.util.List;


public class SpecialCommunicationManager {

    private static final String COMMON_SERVICE_URL = "http://common.chatbot.service";
    private static final String SPECIAL_SERVICE_URL = "http://special.chatbot.service";

    public String sendMessage(String currentMessage, List<ChatMessage> chatHistory) {
        String response;

        if (shouldUseSpecialService(currentMessage, chatHistory)) {
            response = callService(currentMessage, chatHistory, SPECIAL_SERVICE_URL);
        } else {
            response = callService(currentMessage, chatHistory, COMMON_SERVICE_URL);
        }

        return response;
    }

    private boolean shouldUseSpecialService(String currentMessage, List<ChatMessage> chatHistory) {
        // Check if "help" is in current message or chat history
        if (currentMessage.toLowerCase().contains("help")) {
            return true;
        }

        for (ChatMessage message : chatHistory) {
            if (message.getMessage().toLowerCase().contains("help")) {
                return true;
            }
        }

        return false;
    }

    private String callService(String currentMessage, List<ChatMessage> chatHistory, String serviceUrl) {
        // Simulate calling a service and receiving a response
        return "Response from service (" + serviceUrl + ") for message: " + currentMessage;
    }
}
