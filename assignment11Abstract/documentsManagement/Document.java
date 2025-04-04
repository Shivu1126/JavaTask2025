package assignment11Abstract.documentsManagement;

abstract class Document {
	protected String title;
    protected double size; 

    public Document(String title, double size) {
        this.title = title;
        this.size = size;
    }

    public abstract void open();
    public abstract void save();
    public abstract String getType();

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Size: " + size + " KB");
        System.out.println("Type: " + getType());
    }
}
