package pl.sood.factory;

import java.util.HashMap;
import java.util.Map;

abstract class Item {

    Map<String, String> templates = new HashMap<>();

    public Item() {
        initTemplates();
    }

    void initTemplates() {
        templates.put("WhoCreated", "<<Your login will appear here>>");
        templates.put("whenCreated", "<<Creation date here>>");
    }

    abstract void fillTemplates();

    Map<String, String> getTemplates() {
        return templates;
    }

    void putTemplateValue(String label, String value) {
        templates.put(label, value);
    }
}
