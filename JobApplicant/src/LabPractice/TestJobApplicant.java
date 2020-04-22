package LabPractice;

public class TestJobApplicant {

    JobApplicant APP1 = new JobApplicant("John", "0123456789", true, true, true, false);
    JobApplicant APP2 = new JobApplicant("Jane", "4405236464", true, false, false, true);
    JobApplicant App3 = new JobApplicant("Ariel", "4407526464", true, true, true, true);

    public void Interview(JobApplicant applicant) {
        boolean DataB = applicant.getDatabases();
        boolean Spread = applicant.getSpreadsheats();
        boolean WordPro = applicant.getWordprocessing();
        boolean Graphics = applicant.getGraphics();
        float x = 0;
        String name = applicant.getName();
        if (DataB == true) {
            x += 0.25;
        } else {
            x += 0;
        }
        if (Spread == true) {
            x += 0.25;
        } else {
            x += 0;
        }
        if (WordPro == true) {
            x += 0.25;
        } else {
            x += 0;
        }
        if (Graphics == true) {
            x += 0.25;
        } else {
            x += 0;
        }

        if (x>=0.75)
            System.out.println(name + " is hired!");
        else {System.out.println(name + ":   REJECTED!");

    }
    }
}