import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

            Student[] StudentList = new Student[4];
            StudentList[0]=new Graduate("Reem", "0564448202", 20000, 3.6,"AI");
            StudentList[1]=new Undergraduate("Hasan", "0594448202", 20002, 2.8,"SO");
            StudentList[2]=new Undergraduate("Salem", "0501331845", 200001, 2.9,"FR");
            StudentList[3]=new Graduate("Saad", "0563428255", 200003, 4.0,"CS");
        double countUndergraduate=0;
        int numOFU=0;

        for(Student person:StudentList){
                if(person instanceof Undergraduate){
                    countUndergraduate+=person.getGPA();
                    System.out.println(person);
                    numOFU+=1;

                }

            }
        System.out.printf("The Average GPA for Undergraduate students is %.2f", (double) countUndergraduate / numOFU);
        System.out.print("\n");

        double countGraduate=0;
        int numOFG=0;


        for(Student person:StudentList){
                if(person instanceof Graduate){
                    countGraduate+=person.getGPA();
                    System.out.println(person);
                    numOFG+=1;



                }
            }
        System.out.printf("The Average GPA for Undergraduate students is %.2f",(double)countGraduate/numOFG);



    }
}
