public abstract class Document {
    public abstract void create();
}

public class WordDocument extends Document {
    public void create() {
        System.out.println("Word Document Created");
    }
}

public class PdfDocument extends Document {
    public void create() {
        System.out.println("PDF Document Created");
    }
}

public abstract class DocumentFactory {
    public abstract Document createDocument();
}

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
