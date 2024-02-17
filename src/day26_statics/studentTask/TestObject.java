package day26_statics.studentTask;

import day26_statics.studentTask.StudentClass;

public class TestObject {
    public static void main(String[] args) {

        StudentClass student1 = new StudentClass("Yusuf", 21, 'M', "A16");

        StudentClass student2 = new StudentClass("Glenio", 24, 'M', "B34");
        StudentClass student3 = new StudentClass("Sumeyye", 22, 'F', "C56");
        StudentClass student4 = new StudentClass("Mehmet", 25, 'M', "D43");
        StudentClass student5 = new StudentClass("Sebastian", 23, 'M', "E27");

        StudentClass[] students = {student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles",  1);

        group1.addStudent(student1);

        group1.addStudent(students);

        group1.addStudent("Khashayar", 34, 'M', "F35");

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);


        for (StudentClass each : group1.students) {
            System.out.println(each.name +" : " + each.id);
        }

        /*
StudentsGroup{groupName='Java Turtles', groupId=1, number of students=6}
StudentsGroup{groupName='Java Turtles', groupId=1, number of students=4}
Yusuf : A16
Glenio : B34
Sumeyye : C56
Khashayar : F35
 */


        System.out.println("------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup group3 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup group4 = new StudentsGroup("Java Turtles",  1);

        StudentsGroup[] groups = {group1, group2, group3, group4};

// Assuming you have a StudentsGroup object called 'targetGroup' where you want to add all students
        StudentsGroup targetGroup = new StudentsGroup("Target Group", 2);

// Assuming 'groups' is the array containing StudentsGroup objects
        StudentsGroup[] groups2 = {group1, group2, group3, group4};

// Iterate through the array and add all students to the target group
        for (StudentsGroup group : groups2) {
            targetGroup.students.addAll(group.students);
        }

// Print the target group information after adding all students
        System.out.println("Target Group after adding all students:");
        System.out.println(targetGroup);

// Print individual students in the target group
        System.out.println("Individual students in the target group:");
        for (StudentClass student : targetGroup.students) {
            System.out.println(student.name + " : " + student.id);
        }
//Target Group after adding all students:
//StudentsGroup{groupName='Target Group', groupId=2, number of students=4}
//Individual students in the target group:
//Yusuf : A16
//Glenio : B34
//Sumeyye : C56
//Khashayar : F35
    }

}

/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentsGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */

