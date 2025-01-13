public class MenloStudent extends Person {
    private int grade;
    private String advocate;



    public MenloStudent(String firstName, String lastName, int age, int grade, String advocate) {
        super(firstName, lastName, age);
        this.grade = grade;
        this.advocate = advocate;
    }
    public String getAdvocate() {
        return advocate;
    }

    public void setAdvocate(String advocate) {
        this.advocate = advocate;
    }
    public String toString() {
        return super.toString() + "\nGrade: " + grade + "\nAdvocate: " + advocate;
    }

}
