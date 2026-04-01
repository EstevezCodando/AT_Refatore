public class Main {

    public static void main(String[] args) {
        Document documentoPdf = new PdfDocument();
        Document documentoHtml = new HtmlDocument();
        Document documentoWord = new WordDocument();

        documentoPdf.print();
        documentoHtml.print();
        documentoWord.print();
    }
}