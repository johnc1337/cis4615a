public void deleteFile() {
    File someFile = new File("someFileName.txt");
    if (!someFile.delete()) {
        // Handle failure to delete the file
        System.out.println("Failed to delete the file.");
    }
}
