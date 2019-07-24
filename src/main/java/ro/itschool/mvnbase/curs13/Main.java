package ro.itschool.mvnbase.curs13;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader breader = new BufferedReader(new FileReader(new File("src/main/resources/doc.in")));
//        String line = breader.readLine();
//        System.out.println(line);
//        while (line != null) {
//            System.out.println(line);
//            line = breader.readLine();
//        }

        //  DocSource docSource = new MemoryDocSource();
//        DocSource docSource = new FileLineDocSource("src/main/resources/doc.in");
//        testDocumentSercice(docSource);
        DocSource docSource = new FileSplitDoumentSource("src/main/resources/doc2.in");
        testDocumentSercice(docSource);

    }

    private static void testDocumentSercice(DocSource docSource) {
        DocumentService service = new DocumentService(docSource.getDocuments());
        Markup markup =new Markup("1",3,"test");
        service.addMarkup(service.getAllDocuments().get(0).getDocumentId(),markup);
        System.out.println(service.getAllDocuments());

    }
}
