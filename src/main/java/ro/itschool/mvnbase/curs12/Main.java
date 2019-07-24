package ro.itschool.mvnbase.curs12;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Document> documents=new ArrayList<>();
        documents.addAll(List.of(new Document("1","Ana are mere","Povestea Anei"),
                new Document(UUID.randomUUID().toString(),"Petru are pere","Povestea Petru"),
                new Document(UUID.randomUUID().toString(),"Ion are castane","Povestea Ionului")
                ));

        DocumentService documentService =new DocumentService(documents);
        List<Document> docs = documentService.getAllDocuments();
        System.out.println(docs);
        System.out.println("- - - - - - - - - - - - - ");
        System.out.println(documentService.getDocumentWithName("Petru"));
        System.out.println("- - - - - - - - - - - - - ");
        Markup markup1=new Markup("1",3,"Ana");
        documentService.addMarkupForDocument(markup1,"1");
        documentService.addMarkupForDocument(new Markup("2",7,"Test"),"1");
        System.out.println(documentService.getDocumentWithName("Ana"));
        System.out.println("- - - - - - - - - - - - - ");
        System.out.println(documentService.getMarkupsForDocument("1"));

        DocumentPrinter documentPrinter =new DocumentPrinter(documents.get(0));
        System.out.println(documentPrinter.printWithMarkups());
    }
}
