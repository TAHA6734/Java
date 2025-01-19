public class student {
    private int grade;
    private String name;
    private static int StudentCount = 0;

    public student(int grade, String name)throws AnlamsizNotGirisi {
        setGrade(grade);
        this.name = name;
        StudentCount++;
    }

    public void setGrade(int grade) throws AnlamsizNotGirisi {
        if (grade < 0 || grade > 100) {
            throw new AnlamsizNotGirisi("Sadece 0 ile 100 arasi not gireblirsin");
        }
        this.grade = grade;

    }

    public int getGrade() {
        return grade;
    }

    public static int getStudentCount(){
        return StudentCount;
    }
}