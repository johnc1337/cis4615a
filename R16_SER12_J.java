public class MyClass implements Serializable {
    // Fields and methods
    private static final long serialVersionUID = 1L; // Added serialVersionUID for compatibility
}

// Validate the source before deserialization
File file = new File("trusted_file");
if (file.exists()) {
    ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
    MyClass obj = (MyClass) in.readObject();
} else {
    throw new SecurityException("Untrusted or invalid file");
}
