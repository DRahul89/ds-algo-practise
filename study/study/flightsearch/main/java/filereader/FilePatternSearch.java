package main.java.filereader;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class FilePatternSearch {

	public static File[] listFilesMatching(File root, String regex) {
		if (!root.isDirectory()) {
			throw new IllegalArgumentException(root + " is no directory.");
		}
		final Pattern p = Pattern.compile(regex); // careful: could also throw
													// an exception!
		return root.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return p.matcher(file.getName()).matches();
			}
		});
	}

	public static void listFile(String pathname) {
		String regex = "UM*.txt";
		final Pattern p = Pattern.compile(regex);
		File f = new File(pathname);
		File[] listfiles = f.listFiles();
		for (int i = 0; i < listfiles.length; i++) {
			if (listfiles[i].isDirectory()) {
				String name = listfiles[i].getAbsolutePath();
				listFile(name);
			} else {
				if (p.matcher(listfiles[i].getName()).matches())
					System.out.println(listfiles[i]);
			}

		}

	}

	public static void main(String[] args) {
		String dirPath = "C:\\Users\\rdixi7\\Documents\\project\\abc";
		File dir = new File(dirPath);
		String regex = "*File*.tx?";
		// System.out.println(listFilesMatching(dir, regex));
		listFile(dirPath);
	}
}
