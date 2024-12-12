package pkg;

public class MyCharacter {
    public String Role;
    public int intelligence = 10;
    public int strength = 5;
    public int charisma = 3;
    public int dexterity = 2;

    public MyCharacter(String role) {
        Role = role;
        if(Role.equals("Wizard") || Role.equals("wizard")) {
            System.out.println("You chose Wizard! Excelsior!");
        }
        else if(Role.equals("Rogue") || Role.equals("rogue")) {
            System.out.println("You chose Rogue! How cunning!");
        }
        else if(Role.equals("Warrior") || Role.equals("Warrior")) {
            System.out.println("You chose Warrior! For Honor!");
        }
    }
    
    public MyCharacter() {
        Role = new String("No Role");
    }
}