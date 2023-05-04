package basicprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	final Rakuten ran = new Rakuten();
	ran.a="SHIVANI agini";
	ran.b="manu";
     Rakuten b =ran;	
//     FileOutputStream fileOutputStream = new FileOutputStream("SHIVANI.txt");
//     ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//       objectOutputStream.writeObject(ran);
//       objectOutputStream.close();
//       System.out.println("serialiaztion");
//	FileInputStream fileInputStream = new FileInputStream("SHIVANI.txt");
//	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//   Object readObject = objectInputStream.readObject();
//   Rakuten r = (Rakuten)readObject;
//   System.out.println(r.a);
//   System.out.println(r.b);
}
}
