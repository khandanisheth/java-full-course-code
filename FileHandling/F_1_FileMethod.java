import java.io.File;

public class F_1_FileMethod{
    public static void main(String[] args) {
        String filename = "demo.txt";
        File fObj = new File(filename);

        // check if file exists.
        if (fObj.exists()) {
            System.out.println("File Are Exists");
        } else {
            System.out.println("File Are Not Exists");
        }

        // check if file File Name.
        String fn = fObj.getName();
        System.out.println("File Name ->" + fn);

        // check if file File Path.
        String fp = fObj.getAbsolutePath();
        System.out.println("File Path ->" + fp);

        // check if file File Length.
        Long fl = fObj.length();
        System.out.println("File Length ->" + fl);

        // List of files in the directory
        String[] fileList = fObj.list(); // Directory ke andar ki files ka array milta hai

        // Agar directory empty nahi hai
        if (fileList != null) {
            System.out.println("Files in the directory:");
            for (String fileName : fileList) {
                System.out.println(fileName); // Har file ka naam print karna
            }
        } else {
            System.out.println("The directory is empty or not valid.");
        }


        
    // check if file is readable readable.
    if(fObj.canRead()) {
        System.out.println(filename + " file is not readable.");
      } else {
        System.out.println(filename + " file is not readable.");
      }
      
      // delete file.
      if(fObj.delete()) {
        System.out.println(filename + " file deleted successfully.");
      } else {
        System.out.println(filename + " file could not delete.");
      }

    }
}