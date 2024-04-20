package domain;

/**
 * Клас, що описує працівника, включаючи його ID, ім'я, посаду, рівень та департамент
 * @author Trap
 */
public class Employee {

    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Створення об'єкта "працівник" з певними параметрами
     * @param name – ім'я працівника
     * @param jobTitle – назва посади
     * @param level – рівень працівника
     * @param dept – назва відділу
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Задає параметр працівника ID значенням за замовчуванням
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Сеттер параметра jobTitle
     * @param job – назва для посади, яка встановлюється
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Геттер параметра job
     * @return назву посади працівника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Геттер параметра name
     * @return ім'я працівника
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер параметра level
     * @param level – рівень працівника, який встановлюється
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Геттер параметра level
     * @return рівень працівника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Геттер параметра dept
     * @return назву відділу працівника
     */
    public String getDept() {
        return dept;
    }

    /**
     * Сеттер параметра dept
     * @param dept – назву відділу працівника, який встановлюється
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Сеттер параметра dept
     * @param name – ім'я працівника 
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
