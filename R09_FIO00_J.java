public void writeFile(String data) throws IOException {
    FileWriter writer = new FileWriter("output.txt");
    writer.write(data);
    // File is not closed
}
