package ro.itschool.mvnbase.curs12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Document {
    private final String documentId;
    private final String name;
    private final String content;
    private final List<Markup>markups;

    public Document(String documentId,  String content,String name) {
        this.documentId = documentId;
        this.name = name;
        this.content = content;
        this.markups = new ArrayList<>();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(documentId, document.documentId) &&
                Objects.equals(name, document.name) &&
                Objects.equals(content, document.content) &&
                Objects.equals(markups, document.markups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, content, markups);
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", markups=" + markups +
                '}';
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public List<Markup> getMarkups() {
        return markups;
    }

    public void addMarkup(Markup markup){
        markups.add(markup);
    }




}
