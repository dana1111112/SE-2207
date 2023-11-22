class TxtFileReader implements TextFileReader {
    @Override
    public void readFile(String fileName) {
        System.out.println("Reading .txt file: " + fileName);
    }
}