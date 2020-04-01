package grades;

import java.util.HashMap;

import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student target;
        Input input = new Input();
        boolean confirm;
        double allGPA = 0;

        students.put("brycedpayne", new Student("Bryce"));
        target = students.get("brycedpayne");
        students.get("brycedpayne").addGrade(97);
        target.addGrade(90);
        target.addGrade(95);
        target.addGrade(80);
        target.recordAttendance("2020-01-01", "A");
        target.recordAttendance("2020-01-02", "P");
        target.recordAttendance("2020-01-03", "P");

        students.put("ltellenripley", new Student("Ellen"));
        target = students.get("ltellenripley");
        target.addGrade(87);
        target.addGrade(93);
        target.addGrade(96);

        students.put("cpldwaynehicks", new Student("Hicks"));
        target = students.get("cpldwaynehicks");
        target.addGrade(62);
        target.addGrade(71);
        target.addGrade(65);

        students.put("rebeccajorden", new Student("Newt"));
        target = students.get("rebeccajorden");
        target.addGrade(83);
        target.addGrade(92);
        target.addGrade(61);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        String[] userList = students.keySet().toArray(new String[0]);
        for (String user : userList) {
            System.out.print("|" + user + "|  ");
        }
        System.out.print("|all|");
        System.out.println();

        do {
            String user = input.getString("\nWhat student would you like information on?: ");
            target = students.get(user);

            if (user.equalsIgnoreCase("all")) {
                confirm = input.yesNo("\nWould you like to see the overall GPA of the class?: ");

                if (confirm) {
                    allGPA = 0;
                    for (String student : students.keySet()) {
                        allGPA += students.get(student).getGradeAverage();
                    }
                    System.out.printf("\nOverall class GPA: %.2f\n", allGPA / students.size());
                    System.out.println();
                }

                System.out.println("name,github_username,grades,average");
                students.forEach((k, v) -> {
                    System.out.format("%s,%s,%s,%.2f\n", students.get(k).getName(), k, students.get(k).getGrades(), students.get(k).getGradeAverage());
                });
                System.out.println("\n");

            } else if (students.containsKey(user)) {
                System.out.printf("\nName: %s | GitHub Username: %s\nGrades:", target.getName(), user);
                System.out.print(target.getGrades());

                if (Double.isNaN(target.getAttendance())) {
                    System.out.print("\nAttendance: No attendance has been recorded for this student");
                } else {
                    System.out.printf("\nAttendance: %.2f", target.getAttendance());
                }
                System.out.println("\nCurrent GPA: " + target.getGradeAverage() + "\n");
            } else {
                System.out.println("\nSorry, no student found with the username of \"" + user + "\"\n");
            }

            confirm = input.yesNo("Would you like to look for another student?\n\n(y/n)");

        } while (confirm);

        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}
