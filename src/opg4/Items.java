package opg4;

import java.util.ArrayList;

public class Items {

    String itemName;
    String itemType;
    int damageValue;

    public Items(String name, String type, int damageValue) {
        this.itemName = name;
        this.itemType = type;
        this.damageValue = damageValue;
    }
//-------------------------------------------------------------------------------------------//
    //tog tid at forstår hvad jeg skulle ændre  i String da jeg glemte return var en ting....//
    @Override
    public String toString() {
        return itemName + " (" + itemType + ", Damage: " + damageValue + ")";
    }


}