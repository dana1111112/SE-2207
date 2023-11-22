class PdfFileProcessor implements PdfFileReader {
    @Override
    public void readPdfFile(String fileName) {
        System.out.println("Reading .pdf file: " + fileName);
    }
}