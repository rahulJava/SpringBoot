import java.io.*;

class Demonstration1 {
    public static void main( String args[] ) {
    	
        byte[] courseInBytes = serialize();
        System.out.println(courseInBytes.length);

        // Code to deserialize the object
        ByteArrayInputStream bis = new ByteArrayInputStream(courseInBytes);
        try (ObjectInput in = new ObjectInputStream(bis)) {
        EducativeCourse course = (EducativeCourse) in.readObject();
        System.out.println("Course:"+course.toString());
        System.out.println(course.toString());

        } catch (Exception e) {
            // Ignore exception, not to be done in production
        }        
    }

    static byte[] serialize(){
        EducativeCourse javaInterviewBible = new EducativeCourse();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try (ObjectOutput out = new ObjectOutputStream(bos)) {
            out.writeObject(javaInterviewBible);
            out.flush();
        } catch (Exception e) {
            // Ignore exception, not to be done in production
        }
        return bos.toByteArray();
    }
}

class EducativeCourse implements Serializable {

    private String name = "Java Interview Bible";
    private int lessons;
    private int likes;

    public String toString(){
        return name;
    }
}