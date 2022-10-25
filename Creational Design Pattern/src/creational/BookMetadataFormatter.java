package creational;
// ให้ใช้ factory method
public interface BookMetadataFormatter {
    BookMetadataFormatter reset();
    BookMetadataFormatter append(Book b);
    String getMetadataString();
}
