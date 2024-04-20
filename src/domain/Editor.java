package domain;

/**
 * Клас, що описує редактора
 * @see Artist
 * @author Trap
 */
public class Editor extends Artist {

    /**
     * Створення об'єкта "редактор" з певними параметрами
     * @param electronicEditing – використання електронного редагування
     * @param skiils – список навичок редактора
     * @param name – ім'я працівника
     * @param jobTitle – назва посади
     * @param level – рівень працівника
     * @param dept – назва відділу
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює об'єкт "художник" з обраним методом редагування та заданим списком навичок
     * @param electronicEditing – використання електронного редагування
     * @param skiils – навички
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює об'єкт "художник" з обраним методом редагування 
     * @param electronicEditing – використання електронного редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Задає параметр обраного методу редагування за замовчуванням
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Сеттер параметра electronicEditing
     * @return true якщо редактор використовує електронні методи редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Геттер параметра electronicEditing
     * @param electronic – використання електронного редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
