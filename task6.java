interface Weapon {
    void use();
}
class Sword implements Weapon {
    public void use() {
        System.out.println(
                "Slash! Dealing 20 physical damage."
        );
    }
}
class MagicWand implements Weapon {
    public void use() {
        System.out.println(
                "Zap! Dealing 35 magic damage."
        );
    }
}
abstract class Hero {
    protected Weapon weapon;
    public Hero(Weapon weapon) {
        this.weapon = weapon;
    }
    public abstract void attack();
}
class Knight extends Hero {
    public Knight(Weapon weapon) {
        super(weapon);
    }
    public void attack() {
        weapon.use();
    }
}
class Wizard extends Hero {
    public Wizard(Weapon weapon) {
        super(weapon);
    }
    public void attack() {
        weapon.use();
    }
}
public class task6 {
    public static void main(String[] args) {
        Knight knight1 = new Knight(new Sword());
        knight1.attack();
        Knight knight2 = new Knight(new MagicWand());
        knight2.attack();
    }
}
