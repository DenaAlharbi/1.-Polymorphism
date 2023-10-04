public class Student {
    private String Name;
    private String PhoneNum;
    private int ID;
    private double GPA;
    public Student(String name, String phoneNumber,int ID,double GPA){

        setName(name);
        setPhoneNum(phoneNumber);
        this.ID= ID;
        this.GPA = GPA;
    }

    public String getName(){
        return Name;
    }
    public String getPhoneNum() {
        return PhoneNum;
    }

    public double getGPA() {
        return GPA;
    }
    public void setName(String name){
        this.Name= name;
    }
    public void setPhoneNum(String num){
        this.PhoneNum= num;
    }
    //getGPA
    public String toString() {
        String name = "Name: ";
        String phone= "Phone number: ";
        String ID1 = "ID: ";
        String GPA1 = "GPA: ";
        return name+this.getName()+", "+phone+this.getPhoneNum()+"\t" +ID1+this.ID+GPA1+this.GPA;

    }

}
