package pl.sood.factory;

class NoteItemProducer implements ItemFactory {

    @Override
    public Item createItem() {
        NoteItem noteItem = new NoteItem();
        noteItem.fillTemplates();
        return noteItem;
    }
}
