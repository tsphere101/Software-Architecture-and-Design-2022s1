package creational;
// ให้ใช้ builder pattern

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray json;
    private StringWriter writer;

    public JSONBookMetadataFormatter(){
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        json = new JSONArray();
        writer = new StringWriter();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject obj = new JSONObject();
        obj.put("ISBN",b.getISBN());
        obj.put("Title",b.getTitle());
        obj.put("Publisher",b.getPublisher());
        obj.put("Authors",Arrays.toString(b.getAuthors()));
        json.add(obj);

        try {
            json.writeJSONString(writer);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String getMetadataString() {
        return writer.toString();
    }
}
