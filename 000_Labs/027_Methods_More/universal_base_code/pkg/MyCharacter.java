package pkg;

public class MyCharacter {
    public String Role;
    public int intelligence = 0;
    public int strength = 0;
    public int charisma = 0;
    public int dexterity = 0;


    
    public MyCharacter() {
        Role = new String("No Role");
    }
    
    
    
    public String setRole(String role) {
        if(role.equals("Wizard") || role.equals("wizard")) {
            System.out.println("You chose Wizard! Excelsior!");
            Role = "Wizard";
        }
        else if(role.equals("Rogue") || role.equals("rogue")) {
            System.out.println("You chose Rogue! How cunning!");
            Role = "Rogue";
        }
        else if(role.equals("Warrior") || role.equals("warrior")) {
            System.out.println("You chose Warrior! For Honor!");
            Role = "Warrior";
        }
        else {
            System.out.println("not valid role");
            Role = "No Role";
        }
        
        return Role;
    }
    
    public int setStrength(int strength) {
        if(strength < 0) return 0;
        return strength;
        
    }
    
    public int setDexterity(int dexterity) {
        if(strength < 0) return 0;
        
        return dexterity;
    }
    
    public int setIntelligence(int intelligence) {
        if(strength < 0) return 0;
        
        return intelligence;
    }
    
    public int setCharisma(int charisma) {
        if(strength < 0) return 0;
        
        return charisma;
    }
    
    public boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma) {
        Role = setRole(role);
        this.strength = setStrength(strength);
        this.dexterity = setDexterity(dexterity);
        this.intelligence = setIntelligence(intelligence);
        this.charisma = setCharisma(charisma);
        return true;
    }

}