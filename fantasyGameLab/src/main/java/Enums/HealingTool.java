package Enums;

public enum HealingTool {
    LAMBSBREAD(10),
    MYSTICMUSHROOM(15),
    JEGGYBOTTLE(20),
    ERB(25);

    public int value;

    HealingTool(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}