public class MyClass implements Serializable {
    // Fields and methods
}

// Deserializing from an untrusted source
ObjectInputStream in = new ObjectInputStream(new FileInputStream("untrusted_file"));
MyClass obj = (MyClass) in.readObject();
