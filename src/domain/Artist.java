package domain;

/**
 * Клас, що описує художника
 * @see Employee
 * @author Trap
 */
public class Artist extends Employee {

    /**
     * Створення об'єкта "художник" з певними параметрами
     * @param skiils – список навичок художника
     * @param name – ім'я працівника
     * @param jobTitle – назва посади
     * @param level – рівень працівника
     * @param dept – назва відділу
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює об'єкт "художник" з заданим списком навичок
     * @param skiils – навички
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Задає параметр кількості навичок значенням за замовчуванням
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Геттер параметра skills
     * @return список навичок 
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Сеттер параметра skills
     * @param skills – навички, які встановлюються
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Геттер параметра skills
     * @return список навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
