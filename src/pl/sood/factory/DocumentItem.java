package pl.sood.factory;

public class DocumentItem extends Item{
    @Override
    void fillTemplates() {
        templates.put("title", "<>");
        templates.put("content", "<>");
    }
}
