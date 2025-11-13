package atu.ie.Encapsulation;

public class Grade {
    private String studentName;
    private int numericGrade;
    private String courseCode;

    public Grade(String studentName, int numericGrade, String courseCode) {
        setName(studentName);
        setGrade(numericGrade);
        setCode(courseCode);
    }

    public String getName() {
        return studentName;
    }

    public int getGrade() {
        return numericGrade;
    }

    public String getCode() {
        return courseCode;
    }

    public void setName(String studentName) {
        if (validateStudentName(studentName)) {
            this.studentName = studentName;
        } else {
            System.out.println("Invalid name. Setting default value: 'Unknown'.");
            this.studentName = "Unknown";
        }
    }

    public void setGrade(int numericGrade) {
        if (numericGrade >= 0 && numericGrade <= 100) {
            this.numericGrade = numericGrade;
        } else {
            System.out.println("Invalid grade. Setting default value: 0.");
            this.numericGrade = 0;
        }


    }

    public void setCode(String courseCode) {
        if (validateCourseCode(courseCode)) {
            this.courseCode = courseCode;
        } else {
            System.out.println("Invalid course code. Setting default value: 'UNKNOWN101'.");
            this.courseCode = "UNKNOWN101";
        }
    }

    private boolean validateStudentName(String name) {
        return name != null && !name.trim().isEmpty() && name.matches("[a-zA-Z ]+");
    }

    private boolean validateCourseCode(String code) {
        return code != null && code.matches("[A-Z]{4}\\d{3}");
    }
}