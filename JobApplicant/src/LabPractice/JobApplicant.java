package LabPractice;

public class JobApplicant {
    //Job Applicant Criteria
    private String name;
    private String phonenumber;
    private boolean wordprocessing;
    private boolean spreadsheats;
    private boolean databases;
    private boolean graphics;
    //Member methods
    public void setName(String name){
        name = this.name;
    }
    public String getName(){return name;}
    public void setPhonenumber(String number){
        number = this.phonenumber;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setWordprocessing(boolean Value){Value = this.wordprocessing;}
    public boolean getWordprocessing(){return this.wordprocessing;}
    public void setSpreadsheats(boolean Value){Value = this.spreadsheats;}
    public boolean getSpreadsheats(){return this.spreadsheats;}
    public void setDatabases(boolean Value){Value = this.databases;}
    public boolean getDatabases(){return this.databases;}
    public void setGraphics(boolean Value){Value = this.graphics;}
    public boolean getGraphics(){return this.graphics;}

    //Constructor method
    public JobApplicant(String name, String phonenumber, boolean Wordpro, boolean spreadsheats, boolean databases, boolean graphics)
    {
        this.name = name;
        this.phonenumber = phonenumber;
        this.wordprocessing = Wordpro;
        this.spreadsheats = spreadsheats;
        this.databases = databases;
    }
    public void printApplication(){
        System.out.println("Applicant Name: " + this.name);
        System.out.println("Contact Info: " + this.phonenumber);
        System.out.println("Skills: ");
        System.out.println("Can you type well?     " + this.wordprocessing);
        System.out.println("Do you know how to use Excel?     "+ this.spreadsheats);
        System.out.println("Are you good at graphic design?     "+ this.graphics);
        System.out.println("Are you good with databases?     " + this.databases);
    }
}


