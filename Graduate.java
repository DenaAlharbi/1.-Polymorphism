public class Graduate extends Student{
    private String researchArea;
    public Graduate(String name, String phoneNumber,int ID,double GPA, String researchArea){
        super(name, phoneNumber,ID,GPA);
        this.researchArea=researchArea;

    }
    @Override
    public String toString() {
        String RA = "Research Area: ";
        return super.toString() + "\t" +RA + this.researchArea;
    }
}
