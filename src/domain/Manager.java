package domain;

/**
 * Клас, що описує менеджера
 * @see Employee
 * @author Trap
 */
public class Manager extends Employee {

    /**
     * Створення об'єкта "менеджер" з певними параметрами
     * @param employees – список працівників, найнятих менеджером
     * @param name – ім'я працівника
     * @param jobTitle – назва посади
     * @param level – рівень працівника
     * @param dept – назва відділу
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: " + getEmployees(); 
    }

    /**
     * Створює об'єкт "менеджер" з заданим списком працівників
     * @param employees – працівники
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Задає параметр кількості працівників значенням за замовчуванням
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Геттер параметра employees
     * @return список працівників 
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Сеттер параметра employees
     * @param employees – працівники, які встановлюються
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Геттер параметра employees
     * @return список працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    } 
}
