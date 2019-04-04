package Enums;

public enum Treasure {
    RUBY(10),
    EMERALD(15),
    GOLD(20),
    GOBLET(25);


    public int value;

    Treasure(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
