package hus.oop.studentmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                //System.out.println(dataList.toString());
                //System.out.println4(dataList.size());
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                //System.out.println("id: " + dataList.get(0));
                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */

                Student student = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();
                StudentManager.getInstance().append(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void main(String[] args) {

        System.out.println("Original data: ");
        testOriginalData();
        System.out.println("Birth increasing: ");
        testSortYearOfBirthIncreasing();
        System.out.println("Birth decreasing:");
        testSortYearOfBirthDecreasing();
        System.out.println("Math Grade increasing: ");
        testSortMathsGradeIncreasing();
        System.out.println("Math Grade decreasing:");
        testSortMathsGradeDecreasing();
        System.out.println("Physic Grade increasing: ");
        testSortPhysicsGradeIncreasing();
        System.out.println("Physic Grade decreasing:");
        testSortPhysicsGradeDecreasing();
        System.out.println("Chemistry Grade increasing: ");
        testSortChemistryGradeIncreasing();
        System.out.println("Chemistry Grade decreasing:");
        testSortChemistryGradeDecreasing();
        System.out.println("Highest Average Grade: ");

        testFilterStudentsHighestAverageGrade();
        System.out.println("Lowest Average Grade:");
        testFilterStudentsLowestAverageGrade();
        System.out.println("Highest Chemistry Grade:");
        testFilterStudentsHighestChemistryGrade();
        System.out.println("Lowest Chemistry Grade:");
        testFilterStudentsLowestChemistryGrade();
        System.out.println("Highest Maths Grade:");
        testFilterStudentsHighestMathsGrade();
        System.out.println("Lowest Maths Grade:");
        testFilterStudentsLowestMathsGrade();

        System.out.println("Highest Physics Grade:");
        testFilterStudentsHighestPhysicsGrade();
        System.out.println("Lowest Physics Grade:");
        testFilterStudentsLowestPhysicsGrade();
        System.out.println("\n");
    }

    public static void init() {
        String filePath = "D:\\DiscordBot\\Nekov4\\src\\hus\\oop\\data\\students.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        init();
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.println(studentIds);
    }

    public static void testSortYearOfBirthIncreasing() {
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortYearOfBirthDecreasing() {

        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortMathsGradeIncreasing() {

        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortMathsGradeDecreasing() {

        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortPhysicsGradeIncreasing() {

        List<Student> students = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortPhysicsGradeDecreasing() {

        List<Student> students = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortChemistryGradeIncreasing() {

        List<Student> students = StudentManager.getInstance().sortChemistryGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testSortChemistryGradeDecreasing() {

        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsHighestMathsGrade() {

        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsLowestMathsGrade() {

        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        List<Student> nLowestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestMathsGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestMathsGradeStudents);
        System.out.println(codeString);
    }

    public static void testFilterStudentsHighestPhysicsGrade() {


        List<Student> students = StudentManager.getInstance().sortPhysicsGradeDecreasing();
        List<Student> nHighestPhysicsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestPhysicsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestPhysicsGradeStudents);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsLowestPhysicsGrade() {


        List<Student> students = StudentManager.getInstance().sortPhysicsGradeIncreasing();
        List<Student> nLowestPhysicsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestPhysicsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nLowestPhysicsGradeStudents);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsHighestChemistryGrade() {


        List<Student> students = StudentManager.getInstance().sortChemistryGradeDecreasing();
        List<Student> nHighestChemistryGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestChemistryGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestChemistryGradeStudents);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsLowestChemistryGrade() {


        List<Student> students = StudentManager.getInstance().sortChemistryGradeIncreasing();
        List<Student> nLowestChemistryGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestChemistryGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nLowestChemistryGradeStudents);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsHighestAverageGrade() {


        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        List<Student> nHighestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestAverageGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestAverageGradeStudents);
        System.out.println(studentIdsString);
    }

    public static void testFilterStudentsLowestAverageGrade() {


        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        List<Student> nLowestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestAverageGradeStudents.add(students.get(i));
        }

        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nLowestAverageGradeStudents);
        System.out.println(studentIdsString);
    }
}
