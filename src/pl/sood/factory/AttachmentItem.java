package pl.sood.factory;

public class AttachmentItem extends Item {
    @Override
    void fillTemplates() {
        templates.put("name", "");
        templates.put("extension", ".cv");
        templates.put("fullName", "test");
    }
}
