import java.io.File;
import java.io.IOException;

public class FileHandlingMethods {

    public static void main(String[] args) {
        // Create a new file object
        File file = new File("sampleFile.txt");

        try {
            // Create an empty file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Test file properties
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Is readable: " + file.canRead());
        System.out.println("Is writable: " + file.canWrite());
        System.out.println("File exists: " + file.exists());

        // Create a directory
        File directory = new File("sampleDirectory");
        if (directory.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Failed to create directory.");
        }

        // Get the list of files in the directory
        String[] fileList = directory.list();
        if (fileList != null) {
            System.out.println("Files in the directory:");
            for (String fileName : fileList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("No files in the directory.");
        }

        // Delete the file and directory
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete file.");
        }

        if (directory.delete()) {
            System.out.println("Directory deleted successfully.");
        } else {
            System.out.println("Failed to delete directory.");
        }
    }
}
