package Sorting;

class Student {
    String name;
    int cmsId;
    double gpa;

    Student(String name, int cmsId, double gpa) {
        this.name = name;
        this.cmsId = cmsId;
        this.gpa = gpa;
    }

    void printStudent() {
        System.out.println("Name: " + name + ", CMS-ID: " + cmsId + ", GPA: " + gpa);
    }
}

public class SortStudents {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Qasim", 101, 3.5),
                new Student("Anees", 104, 2.9),
                new Student("Haseeb", 102, 3.9),
                new Student("Taraz", 103, 3.2)
        };

        System.out.println("=== BEFORE SORTING ===");
        printArray(students);

        sortByGpaDescending(students);

        System.out.println("\n=== AFTER SORTING (by GPA Descending) ===");
        printArray(students);
    }

    public static void sortByGpaDescending(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].gpa < arr[j + 1].gpa) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].printStudent();
        }
    }
}
