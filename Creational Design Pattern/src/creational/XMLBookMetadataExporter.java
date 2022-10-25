package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter getFormat() throws ParserConfigurationException {
        return new XMLBookMetadataFormatter();
    }
    
}
