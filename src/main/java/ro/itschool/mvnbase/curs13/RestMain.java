package ro.itschool.mvnbase.curs13;

import ro.itschool.mvnbase.curs14.DocWriter;
import ro.itschool.mvnbase.curs14.RestDocSource;

import java.io.IOException;
import java.util.List;

public class RestMain {
    public static void main(String[] args) throws IOException {
        List<Document> documents=new RestDocSource().getDocuments();
        System.out.println(documents);
        DocWriter docWriter = new DocWriter("src/main/resources/out.txt");
        docWriter.writte(documents);

    }
}
