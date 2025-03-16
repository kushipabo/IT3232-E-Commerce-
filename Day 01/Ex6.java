class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Ex6 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 78);
        Student student3 = new Student("Charlie", 92);
        Student student4 = new Student("David", 88);
        Student student5 = new Student("Eve", 95);

        Student[] students = {student1, student2, student3, student4, student5};

        int totalMarks = 0;
        for (int i = 0; i < students.length; i++) {
            totalMarks += students[i].marks;
        }
        double average = totalMarks / (double) students.length;
        System.out.println("Average Marks: " + average);
    }
}
