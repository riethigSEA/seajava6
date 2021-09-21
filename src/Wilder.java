public class Wilder {
    private String sfirstname;
    private boolean bpresent;

    public Wilder(String fs, boolean p){
        this.sfirstname = fs;
        this.bpresent = p;
    }
    public String getfirstname(){
        return sfirstname;
    }
    public boolean getpresent(){
        return bpresent;
    }
    public void setfirstname(String newfirstname){
        this.sfirstname = newfirstname;
    }
    public void setpresent(boolean newpresent){
        this.bpresent = newpresent;
    }
    public String whoAmI(){
        if(this.getpresent() == true) {
            return "My name is " + this.getfirstname() + " and I am present!";
        }
        else{
            return "My name is " + this.getfirstname() + " and I am not present!";
        }
    }
}