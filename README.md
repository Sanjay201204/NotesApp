📒 Notes App (Java File I/O)

This is a simple text-based *Notes Manager* built in Java using *File I/O*.  
The project allows you to *write, **append, and **view* notes stored in a text file (notes.txt).  

 🚀 Features
- ✍ Write new notes (overwrite mode).
- ➕ Append new notes without deleting old ones.
- 📖 View all saved notes.
- ⚡ Uses FileWriter, FileReader, and BufferedReader.
- 🛡 Includes exception handling with try-with-resources.

 🛠 Tools & Concepts Used
- Java SE  
- File I/O (FileWriter, FileReader, BufferedReader)  
- Exception handling (IOException, FileNotFoundException)  
- VS Code / Terminal  

 📂 Project Structure

- NotesApp.java -> Main Source code notes.txt -> Files Where notes are stored

 ▶ How to Run
1. Clone or download the repository.  
2. Open a terminal in the project folder.  
3. Compile the program:
   
   javac NotesApp.java
   java NotesApp

📌Sample Menu

=== Notes App ===
1. Write a new note (overwrite)
2. Add a note (append)
3. View all notes
4. Exit

Sample Output

=== Notes App ===
1. Write a new note (overwrite)
2. Add a note (append)
3. View all notes
4. Exit
Enter your choice: 1
Enter note: Today I have Eye Check up
Note saved successfully!

=== Notes App ===
1. Write a new note (overwrite)
2. Add a note (append)
3. View all notes
4. Exit
Enter your choice: 1
Enter note: tomorrow i have to attend a marriage
Note saved successfully!

=== Notes App ===
1. Write a new note (overwrite)
2. Add a note (append)
3. View all notes
4. Exit
Enter your choice: 2
Enter note: in sirumugai
Note saved successfully!

=== Notes App ===
1. Write a new note (overwrite)
2. Add a note (append)
3. View all notes
4. Exit
Enter your choice: 3

--- Saved Notes ---
tomorrow i have to attend a marriage
in sirumugai
-------------------

=== Notes App ===
1. Write a new note (overwrite)
2. Add a note (append)
3. View all notes
4. Exit
Enter your choice: 4
Exiting... Goodbye!
