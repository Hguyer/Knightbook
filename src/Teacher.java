class Teacher extends Person {
    private int salary;
    private String subject;

    public Teacher(String firstName, String lastName, int age, int salary, String subject) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nSubject: " + subject;
    }
}