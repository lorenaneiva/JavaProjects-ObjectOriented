public class StudentProjectMain {
    public static void main(String[] args) {
        Student student = new Student("Beatriz Lima da Silva", 4181423, 7.43, 6.77);
        Student otherStudent = new Student("Diego Damasceno", 4182365, 9.0, 2.3);

        student.studentInfo();
        otherStudent.studentInfo();

        student.checking();
        otherStudent.checking();
        
        otherStudent.setAv1(10);
        otherStudent.setAv2(8);
        otherStudent.studentInfo();
        otherStudent.checking();

    }
}
