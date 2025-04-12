package assignment13.librarymanagement.model;


public class Transaction {
	private int transcantionId;
	private int bookId;
	private String userId;
	private String assignDate;
	private String returnDate;
	public Transaction(int transcantionId, int bookId, String userId, String assignDate, String returnDate) {
		this.transcantionId = transcantionId;
		this.bookId = bookId;
		this.userId = userId;
		this.assignDate = assignDate;
		this.returnDate = returnDate;
	}
	public int getTranscantionId() {
		return transcantionId;
	}
	public void setTranscantionId(int transcantionId) {
		this.transcantionId = transcantionId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAssignDate() {
		return assignDate;
	}
	public void setAssignDate(String assignDate) {
		this.assignDate = assignDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}	
}	
