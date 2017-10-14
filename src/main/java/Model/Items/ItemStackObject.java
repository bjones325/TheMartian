package main.java.Model.Items;

import main.java.Model.Items.ItemEnum;

public class ItemStackObject {
    private ItemEnum _obj;
    private int _amount;

    public ItemStackObject(ItemEnum obj, int amount) {
        _obj = obj;
        _amount = amount;
    }

    public ItemEnum get_obj() {
        return _obj;
    }

    public int get_amount() {
        return _amount;
    }

    public void increment_amount(int incrm) {
        this._amount = _amount + incrm;
    }
}
