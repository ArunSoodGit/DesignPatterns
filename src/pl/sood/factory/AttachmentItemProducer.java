package pl.sood.factory;

public class AttachmentItemProducer implements ItemFactory {
    @Override
    public Item createItem() {
        AttachmentItem attachmentItem = new AttachmentItem();
        attachmentItem.fillTemplates();
        return attachmentItem;
    }
}
