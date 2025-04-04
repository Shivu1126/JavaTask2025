package assignment11Abstract.documentsManagement;

class PDFDocument extends Document {
    public PDFDocument(String title, double size) {
        super(title, size);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document in a PDF reader...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document to disk...");
    }

    @Override
    public String getType() {
        return "PDF";
    }
}

class TextDocument extends Document {
    public TextDocument(String title, double size) {
        super(title, size);
    }

    @Override
    public void open() {
        System.out.println("Opening Text document in a text editor...");
    }

    @Override
    public void save() {
        System.out.println("Saving Text document to disk...");
    }

    @Override
    public String getType() {
        return "Text";
    }
}

class ImageDocument extends Document {
    public ImageDocument(String title, double size) {
        super(title, size);
    }

    @Override
    public void open() {
        System.out.println("Opening Image document in an image viewer...");
    }

    @Override
    public void save() {
        System.out.println("Saving Image document to gallery...");
    }

    @Override
    public String getType() {
        return "Image";
    }
}

public class DocumentsApp {

	public static void main(String[] args) {
		Document pdf = new PDFDocument("Resume", 150.5);
        Document text = new TextDocument("Notes", 30.2);
        Document image = new ImageDocument("Photo", 250.0);

        Document[] docs = { pdf, text, image };

        for (Document doc : docs) {
            doc.displayInfo();
            doc.open();
            doc.save();
            System.out.println("------------------------------------");
        }
	}

}
