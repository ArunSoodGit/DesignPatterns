package pl.sood.factory;

public class NoteItem extends Item {
    @Override
    void fillTemplates() {
        templates.put("content", "<<Please write your notes here>>");
    }
}
