package characters;

public class PrimaryAttributes {

    private int strength;
    private int dexterity;
    private int intelligence;
    private int vitality;

    public PrimaryAttributes(int strength, int dexterity, int intelligence, int vitality) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void addStrength(int strength) {
        this.strength += strength;
    }

    public void addDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    public void addIntelligence(int intelligence) {
        this.intelligence += intelligence;
    }

    public void addVitality(int vitality) {
        this.vitality += vitality;
    }

}

