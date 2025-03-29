public class student {
    private String name;
    private int grade;

    public student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }

    private void setGrade(int grade) {
        if (grade  >= 0 && grade <= 100) {
            this.grade = grade;
        }
        else {this.grade = 0;}
    }


}
