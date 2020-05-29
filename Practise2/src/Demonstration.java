import java.io.*;

public class Demonstration {
    public static void main( String args[] ) {
        EducativeCourse1 javaInterviewBible = new EducativeCourse1();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try (ObjectOutput out = new ObjectOutputStream(bos)) {
            out.writeObject(javaInterviewBible);
            out.flush();
        } catch (Exception e) {
            // Ignore exception, not to be done in production
        }
        byte[] courseInBytes = bos.toByteArray();
        System.out.println(bos.toByteArray().toString());
        System.out.println("Serialized byte array length : "  + courseInBytes.length);
    }
}

class EducativeCourse1 implements Serializable {

    private String name = "Java Interview Bible";
    private int lessons;
    private int likes;
}