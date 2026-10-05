import java.io.File;
import java.util.*;

class FileSystem {
	public static void main(String [] args) {
		File root = new File("/Users/rakeshkumar/Workspace");
		File[] files = root.listFiles();
		Queue<File> queue = new LinkedList<>();
		addFiles(files, queue);
		
		while (!queue.isEmpty()) {
			File item = queue.poll();
			if (item.isDirectory()) {
				addFiles(item.listFiles(), queue);
			} else {
				System.out.println("File -> " + item.getName());
			}
		}
		
	}
	
	public static void addFiles(File[] files, Queue<File> dir) {
		if (files != null) {
			for (File file : files) {
				dir.add(file);
			}
		}
	}
}