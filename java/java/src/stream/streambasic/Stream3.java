package stream.streambasic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Stream3 {

	public static void main(String[] args) throws IOException {
		Stream<String> lines = Files.lines(Paths.get("C:\\Users\\anils\\OneDrive\\Documents\\mytxt.txt"));
		lines.sorted().filter(x->x.length()>10).forEach(System.out::println);
		lines.close();
	}
}
