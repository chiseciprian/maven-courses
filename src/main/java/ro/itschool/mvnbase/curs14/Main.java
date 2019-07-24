package ro.itschool.mvnbase.curs14;

import ro.itschool.mvnbase.curs13.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document;

        DocWriter docWriter = new DocWriter("src/main/resources/out.txt");
        for (int i = 0; i < 20; i++) {
            docWriter.writte(new Document("name" + i, "content" + i));
            docWriter.close();
        }
        docWriter.close();

    }
}
