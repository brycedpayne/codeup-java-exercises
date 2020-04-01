package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String,String> attendance;
    private int totaldays=0;
    Input input = new Input();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }
    // records the students attendance
    public void recordAttendance(String date, String value) {
        if (!value.equalsIgnoreCase("P") && !value.equalsIgnoreCase("A")){
            value = input.getString("Please enter P or A: ").toUpperCase();
            recordAttendance(date,value);
        }
        attendance.put(date,value);
        totaldays++;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : grades)
            sum += grade;
        return sum/grades.size();
    }

    public double getAttendance(){
        int daysAttended = 0;

        for (String day : attendance.keySet()) {
            if (attendance.get(day).equalsIgnoreCase("p")) {
                daysAttended++;
            }
        }
        return (double)daysAttended/attendance.size()*100;
    }

    public static void main(String[] args) {
//        Input input = new Input();
//        Student student1 = new Student("Bryce");
//        student1.addGrade(90);
//        student1.addGrade(95);
//        student1.addGrade(85);
//        student1.recordAttendance("2020-01-01", "P");
//        student1.recordAttendance("2020-01-02", "P");
//        student1.recordAttendance("2020-01-03", "A");
//        student1.recordAttendance("2020-01-04", "P");
//
//        student1.recordAttendance(input.getString("Date (yyyy-mm-dd): "), input.getString("(P)resent/(A)bsent: "));
//        System.out.printf("Attended %.2f%% of the time. ", student1.getAttendance());
//        System.out.println(student1.grades);
//        System.out.println(student1.getGradeAverage());
    }
}
