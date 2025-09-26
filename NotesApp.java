import java.io.*;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Notes App ===");
            System.out.println("1. Write a new note (overwrite)");
            System.out.println("2. Add a note (append)");
            System.out.println("3. View all notes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter note: ");
                    String note = scanner.nextLine();
                    writeNote(note, false); // overwrite
                    break;
                case 2:
                    System.out.print("Enter note: ");
                    String newNote = scanner.nextLine();
                    writeNote(newNote, true); // append
                    break;
                case 3:
                    readNotes();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Write notes to file
    private static void writeNote(String note, boolean append) {
        try (FileWriter fw = new FileWriter(FILE_NAME, append)) {
            fw.write(note + System.lineSeparator());
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing note: " + e.getMessage());
        }
    }

    // Read notes from file
    private static void readNotes() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Saved Notes ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("-------------------");
        } catch (FileNotFoundException e) {
            System.out.println("No notes found. Please add notes first.");
        } catch (IOException e) {
            System.out.println("Error reading notes: " + e.getMessage());
        }
    }
}