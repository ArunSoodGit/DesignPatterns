package pl.sood.factory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FactoryStart {
    public static void main(String[] args) {
        // Tworzymy obiekt producenta dokumentów, dzia³aj¹cego pod kontrol¹ fabryki
        DocumentItemProducer documentItemProducer = new DocumentItemProducer();
        Item document = documentItemProducer.createItem();

        // Tworzymy obiekt producenta za³¹czników
        AttachmentItemProducer attachmentItemProducer = new AttachmentItemProducer();
        Item attachment = attachmentItemProducer.createItem();

        // Tworzymy obiekt producenta notatek
        NoteItemProducer noteItemProducer = new NoteItemProducer();
        Item note = noteItemProducer.createItem();

        // Drukujemy szablony dla pól dokumentu
        attachmentTemplate(attachment);

        // Wype³niamy szablony przyk³adowymi danymi
        documentUseCase(attachment);
    }

    private static void documentTemplate(Item document) {

        System.out.println(String.format("%s: %s", "Document title",
                document.getTemplates().get("title")));
        System.out.println(String.format("%s: %s", "Who created",
                document.getTemplates().get("whoCreated")));
        System.out.println(String.format("%s: %s", "When document was created",
                document.getTemplates().get("whenCreated")));
        System.out.println("\n");
    }

    private static void attachmentTemplate(Item attachment) {

        System.out.println(String.format("%s: %s", "Document title",
                attachment.getTemplates().get("title")));
        System.out.println(String.format("%s: %s", "Who created",
                attachment.getTemplates().get("whoCreated")));
        System.out.println(String.format("%s: %s", "When document was created",
                attachment.getTemplates().get("whenCreated")));
        System.out.println(String.format("%s: %s", "Document extension",
                attachment.getTemplates().get("extension")));
        System.out.println("\n");
    }
    private static void documentUseCase(Item document) {

        document.putTemplateValue("title", "Kontrakt b2b");
        document.putTemplateValue("whoCreated", "Jan Kowalski");
        document.putTemplateValue("whenCreated",
                DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm").format(LocalDateTime.now()));

        System.out.println(String.format("%s: %s", "Document title",
                document.getTemplates().get("title")));
        System.out.println(String.format("%s: %s", "Who created",
                document.getTemplates().get("whoCreated")));
        System.out.println(String.format("%s: %s", "When document was created",
                document.getTemplates().get("whenCreated")));
    }
}
