package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter getFormat() {
        return new JSONBookMetadataFormatter();
    }
    
}
