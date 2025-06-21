// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {

        ExcelDocument ed= new ExcelFactory().createDocument();
        ed.calculateFormulas();

        PdfDocument pd= new PdfFactory().createDocument();
        pd.encrypt();

        WordDocument wd= new WordFactory().createDocument();
        wd.spellCheck();
    }
}