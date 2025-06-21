public class ExcelFactory extends DocumentFactory{
    public ExcelDocument createDocument(){
        return new ExcelDoc();
    }
}
