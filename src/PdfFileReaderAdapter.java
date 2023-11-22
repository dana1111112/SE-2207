class PdfFileReaderAdapter implements TextFileReader {
    private PdfFileReader pdfFileReader;

    public PdfFileReaderAdapter(PdfFileReader pdfFileReader) {
        this.pdfFileReader = pdfFileReader;
    }

    @Override
    public void readFile(String fileName) {
        pdfFileReader.readPdfFile(fileName);
    }
}