public void writeFile(String data) throws IOException {
    try (FileWriter writer = new FileWriter("output.txt")) {
        writer.write(data);
    } catch (IOException e) {
        System.err.println("An error occurred: " + e.getMessage());
    }
}
