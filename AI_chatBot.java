import java.util.Scanner;

public class AI_chatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my chatbot!");

        while (true) {
            System.out.println("What would you like to talk about? ");
            String userInput = scanner.nextLine();

            // Process the user input and generate a response
            String response = generateResponse(userInput);

            // Send the response to the user
            System.out.println(response);
        }
    }

    private static String generateResponse(String userInput) {
        // Simple rules to generate responses
        
        if (userInput.contains("hello")) {
            return "Hello! How can I help you today?";
        } else if (userInput.contains("how are you")) {
            return "I am doing well, thank you for asking! How are you doing today?";
        } else if (userInput.contains("goodbye")) {
            return "Goodbye! It was nice talking to you. Have a great day!";
        } else if (userInput.contains("name")) {
            return "My name is Yumiko. It's nice to meet you!";
        } else if (userInput.contains("hobby")) {
            return "My hobby is learning new things. I love to read, write, and code.";
        } else if (userInput.contains("favorite food")) {
            return "My favorite food is pizza. What's yours?";
        } else if (userInput.contains("feeling")) {
            return "How are you feeling today?";
        } else if (userInput.contains("weather")) {
            return "The weather today is sunny and warm. What do you think of it?";
        }

        // More specific conditions
        else if (userInput.contains("favorite color")) {
            return "My favorite color is blue. What's yours?";
        } else if (userInput.contains("favorite book")) {
            return "My favorite book is The Lord of the Rings. What's yours?";
        } else if (userInput.contains("favorite movie")) {
            return "My favorite movie is The Shawshank Redemption. What's yours?";
        } else if (userInput.contains("favorite TV show")) {
            return "My favorite TV show is Breaking Bad. What's yours?";
        } else if (userInput.contains("favorite sport")) {
            return "My favorite sport is basketball. What's yours?";
        } else if (userInput.contains("favorite team")) {
            return "My favorite team is the Golden State Warriors. What's yours?";
        } else if (userInput.contains("favorite player")) {
            return "My favorite player is Stephen Curry. What's yours?";
        } else if (userInput.contains("favorite place")) {
            return "My favorite place is Yosemite National Park. What's yours?";
        } else if (userInput.contains("favorite food")) {
            return "My favorite food is pizza. What's yours?";
        } else if (userInput.contains("favorite drink")) {
            return "My favorite drink is iced coffee. What's yours?";
        } else if (userInput.contains("favorite music")) {
            return "My favorite music is hip hop. What's yours?";
        } else if (userInput.contains("favorite artist")) {
            return "My favorite artist is Kendrick Lamar. What's yours?";
        } else if (userInput.contains("favorite animal")) {
            return "My favorite animal is the penguin. What's yours?";
        } else if (userInput.contains("travel")) {
            return "I love to travel and explore new places. Do you enjoy traveling?";
        } else if (userInput.contains("family")) {
            return "I don't have a family, but I'm here to chat with you! Tell me about your family.";
        } else if (userInput.contains("technology")) {
            return "Technology is fascinating. What's your favorite tech gadget?";
        } else if (userInput.contains("dream job")) {
            return "My dream job is to be a helpful chatbot. What's your dream job?";
        } else if (userInput.contains("holidays")) {
            return "I enjoy holidays. What's your favorite holiday and why?";
        } else if (userInput.contains("weekend plans")) {
            return "What are your plans for the weekend? I'm here to chat if you need suggestions!";
        } else if (userInput.contains("books or movies")) {
            return "I enjoy both books and movies. Which do you prefer, and why?";
        } else if (userInput.contains("pet")) {
            return "I don't have a pet, but I'd love to hear about yours if you have one!";
        } else if (userInput.contains("time travel")) {
            return "Time travel would be an exciting adventure. Where and when would you go?";
        } else if (userInput.contains("goals")) {
            return "Setting and achieving goals is important. Do you have any current goals?";
        } else if (userInput.contains("exercise")) {
            return "Exercise is a great way to stay healthy. What's your favorite way to stay active?";
        } else if (userInput.contains("music genre")) {
            return "There are so many music genres. What's your favorite music genre?";
        } else if (userInput.contains("superpower")) {
            return "If you could have any superpower, what would it be and why?";
        } else if (userInput.contains("cooking")) {
            return "Cooking can be fun and delicious. What's your signature dish?";
        } else if (userInput.contains("inspiration")) {
            return "I find inspiration in learning and helping others. What inspires you?";
        } else if (userInput.contains("phobias")) {
            return "Phobias can be interesting. Do you have any unusual fears or phobias?";
        } else if (userInput.contains("motto")) {
            return "I don't have a motto, but I believe in continuous learning. Do you have a motto?";
        } else if (userInput.contains("gaming")) {
            return "Gaming is a popular hobby. What's your favorite video game?";
        } else if (userInput.contains("languages")) {
            return "Languages are fascinating. How many languages do you speak?";
        } else if (userInput.contains("art")) {
            return "Art can be a great form of self-expression. Do you enjoy creating art?";
        } else if (userInput.contains("technology trends")) {
            return "Technology trends are always evolving. What's the latest tech trend you're interested in?";
        } else if (userInput.contains("nature")) {
            return "Nature is beautiful. What's your favorite natural place to visit?";
        } else if (userInput.contains("education")) {
            return "Education is essential. What's your favorite subject or field of study?";
        } else if (userInput.contains("bucket list")) {
            return "Do you have a bucket list? If so, what's on the top of it?";
        } else if (userInput.contains("zodiac sign")) {
            return "I'm just a chatbot, but I can tell you about your zodiac sign. What's your sign?";
        } else if (userInput.contains("dream vacation")) {
            return "Dream vacations are exciting. Where is your dream destination?";
        } else if (userInput.contains("favorite season")) {
            return "My favorite season is spring. What's your favorite season and why?";
        } else if (userInput.contains("hometown")) {
            return "I don't have a hometown, but I'd love to hear about yours!";
        } else if (userInput.contains("work")) {
            return "Work is a big part of our lives. What do you do for a living?";
        } else if (userInput.contains("happiness")) {
            return "Happiness is important. What makes you happiest in life?";
        } else if (userInput.contains("childhood memory")) {
            return "Childhood memories are precious. Do you have a favorite childhood memory?";
        } else if (userInput.contains("fear")) {
            return "Fears can be challenging. Is there a fear you've overcome or still face?";
        } else if (userInput.contains("hiking")) {
            return "Hiking is a great outdoor activity. Have you been on any memorable hikes?";
        } else if (userInput.contains("dream car")) {
            return "If you could have any car, what would your dream car be?";
        } else if (userInput.contains("fashion")) {
            return "Fashion is a form of self-expression. How would you describe your style?";
        } else if (userInput.contains("invention")) {
            return "Inventions have changed the world. If you could invent something, what would it be?";
        } else if (userInput.contains("creativity")) {
            return "Creativity is a valuable trait. How do you express your creativity?";
        } else if (userInput.contains("time management")) {
            return "Time management is crucial. Do you have any time-saving tips?";
        } else if (userInput.contains("environment")) {
            return "Taking care of the environment is important. What steps do you take to be eco-friendly?";
        } else if (userInput.contains("hobbies")) {
            return "Hobbies are a great way to unwind. What are your favorite hobbies?";
        } else if (userInput.contains("current events")) {
            return "Staying informed is essential. What's your take on current events?";
        } else if (userInput.contains("random fact")) {
            return "Here's a random fact: Honey never spoils. What's your favorite random fact?";
        } else if (userInput.contains("movies or TV shows")) {
            return "Do you prefer watching movies or TV shows, and why?";
        } else if (userInput.contains("motivation")) {
            return "Motivation is key to success. What keeps you motivated?";
        } else if (userInput.contains("travel destinations")) {
            return "Traveling is an adventure. What are your top travel destinations?";
        } else if (userInput.contains("dream home")) {
            return "If you could design your dream home, what would it look like?";
        } else {
            return "I am not sure what you mean. Can you please rephrase your question?";
        }
    }
}
