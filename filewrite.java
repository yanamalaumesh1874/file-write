import java.io.FileWriter;   
import java.io.IOException;  
public class write 
	{
  public static void main(String[] args) 
	  {
    try {
      FileWriter myWriter = new FileWriter("D://filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully written in the file");
    } 
	catch (IOException e) 
	{
      System.out.println("plz check the code");
      e.printStackTrace();
    }
  }
}
