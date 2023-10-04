public class Undergraduate extends Student{
    private String level;
    public Undergraduate(String name, String phone, int sid, double gpa, String level) {
        super(name, phone,sid,gpa);
        this.level=level;
    }



    @Override
    public String toString() {
        String level1 = "Level: ";
        return super.toString() +"\t" +level1 + this.level;
    }
}
