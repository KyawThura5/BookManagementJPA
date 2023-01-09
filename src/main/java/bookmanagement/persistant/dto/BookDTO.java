package bookmanagement.persistant.dto;
import javax.persistence.*;
@Entity
public class BookDTO {
@Id
@Column(name = "book_code")
private String bookCode;
@Column(name = "book_title")
private String bookTitle;
@Column(name = "book_author")
private String bookAuthor;
@Column(name = "book_price")
private double bookPrice;
public String getBookCode() {
return bookCode;
}
public void setBookCode(String bookCode) {
this.bookCode = bookCode;
}
public String getBookTitle() {
return bookTitle;
}
public void setBookTitle(String bookTitle) {
this.bookTitle = bookTitle;
}
public String getBookAuthor() {
return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
this.bookAuthor = bookAuthor;
}
public double getBookPrice() {
return bookPrice;
}
public void setBookPrice(double bookPrice) {
this.bookPrice = bookPrice;
}
}