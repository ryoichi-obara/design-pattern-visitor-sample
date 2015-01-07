package jp.ktsystem.ambitious.designpattern.temporary;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WebServiceProvider {

	public static void main(String[] args) {
		new WebServiceProvider().method("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	}

	public void method(String receivedXml) {

		String dir = System.getProperty("user.dir");
		String filename = new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date()) + "_method.xml";
		Path path = Paths.get(dir + "/" + filename);

		System.out.println(path.getFileName());
		System.out.println(path.toFile().getPath());

		try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
			writer.write(receivedXml);
			writer.newLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
