package ro.itschool.mvnbase.curs12;

import java.util.List;

public class DocumentPrinter {
    private final Document document;

    public DocumentPrinter(Document document) {
        this.document = document;
    }

    public  String printWithMarkups(){
        List<Markup>markups=document.getMarkups();
        String originalContetn=document.getContent();
        String newContent="";
        int markupSize=markups.size();
        int markupIndex=0;
        Markup markup=null;
            for (int i = 0; i < originalContetn.length(); i++) {
                if (markupIndex<markupSize){
                    markup=markups.get(markupIndex);
                }
                if (markup!=null && markup.getPosition()==i){
                    newContent += "["+markup.getContent()+"]";
                    markupIndex++;

                }else {
                    newContent += originalContetn.charAt(i);
                }
            }
        return newContent;
    }
}
