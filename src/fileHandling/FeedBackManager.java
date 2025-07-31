package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class FeedBack{
    private static final String FILE_PATH = "feedback.txt";

    public static void submitFeedback(String username, String feedback) {
        try {
            FileWriter writer = new FileWriter(FILE_PATH, true); // true = append mode
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timeStamp = dtf.format(LocalDateTime.now());

            writer.write("[" + timeStamp + "] Username: " + username + "\n");
            writer.write("Feedback: " + feedback + "\n");
            writer.write("--------------------------------------------------\n");
            writer.close();

            System.out.println("Feedback saved successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while saving feedback.");
//            e.printStackTrace();
        }
    }

}

public class FeedBackManager {
    public static void main(String[] args) {
        FeedBack.submitFeedback("jothi","fdsgyfgusgusz");
    }
}



//[2025-07-30 10:15:23] Username: jothi
//Feedback: Very useful app. Please add dark mode.
//        --------------------------------------------------
