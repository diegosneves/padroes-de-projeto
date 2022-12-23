package diegosneves.github.prototype.app;

import diegosneves.github.prototype.model.Prototipo;

import java.util.HashMap;
import java.util.Map;

public class RegistroDePrototipo {

    private Map<String,Prototipo> list = new HashMap<>();

    public void addItem(String id, Prototipo prototipo) {
        list.put(id, prototipo);
    }

    public Prototipo getPorId(String id) {
        return list.get(id);
    }

    public Prototipo getPorCor(String cor) {
        for (Prototipo p : list.values()) {
            if (p.getCor().equals(cor)) {
                return p;
            }
        }
        return null;
    }

}
