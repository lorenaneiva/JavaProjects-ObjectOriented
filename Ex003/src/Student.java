public class Student {
    private String name;
    private int enrollment;
    private double av1;
    private double av2;
    
    public Student(String name, int enrollment, double av1, double av2){
        this.name = name;
        this.enrollment = enrollment;
        this.av1 = av1;
        this.av2 = av2;
    }

    public void setAv1(double av1){
         this.av1 = av1;   
         System.out.printf("%s's AV1 grade has been uptade to %.2f%n", this.name, this.av1);
    }

    public void setAv2(double av2){
        this.av2 = av2;
        System.out.printf("%s's AV2 grade has been uptade to %.2f%n", this.name, this.av2);
    }

    public void studentInfo(){
        System.out.printf("Student information: %n Student name: %s%n Student enrollment %d%n Note from av1: %.2f%n Note from av2 %.2f%n", this.name, this.enrollment, this.av1, this.av2);
        System.out.println("--");
    }
    public double average(){
        return (this.av1 + this.av2)/2;
    }
    void checking(){
        double average = average();
       if (average <= 3.99) {
            System.out.printf("The student %s has failed, if a grade of %.2f%n", this.name, average);
       } else if(average <= 6.99){
        System.out.printf("The student %s is in remedial classes, with grade %.2f%n", this.name, average);
       } else{
        System.out.printf("The student %s passed, with a grade %.2f%n", this.name, average);
       }
       System.out.println("--");
    }
}
