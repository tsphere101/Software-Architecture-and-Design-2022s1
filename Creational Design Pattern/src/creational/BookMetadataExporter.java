package creational;
import java.io.FileWriter;
import java.io.IOException;
//ต้องสร้าง subclass เป็นตัว creator
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws Exception{
        BookMetadataFormatter formatter = getFormat();
        for (Book book : books)
        {
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());
        
        try (FileWriter file = new FileWriter("./export.txt")){
            file.write(formatter.getMetadataString());
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public abstract BookMetadataFormatter getFormat() throws Exception;
}
