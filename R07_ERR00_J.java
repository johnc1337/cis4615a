public void readFile() {
    try {
        FileReader reader = new FileReader("test.txt");
        // Read from the file
    } catch (IOException e) {
        System.err.println("An error occurred: " + e.getMessage());
        e.printStackTrace();
    }
}
