package LabPractice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestJobApplicant test =  new TestJobApplicant();
        JobApplicant APP1 = new JobApplicant("John", "0123456789", true, true, true, false);
        JobApplicant APP2 = new JobApplicant("Jane", "4405236464", true, false, false, true);
        JobApplicant App3 = new JobApplicant("Ariel", "4407526464", true, true, true, true);
        APP1.printApplication();
        test.Interview(APP1);
        APP2.printApplication();
        test.Interview(APP2);
        App3.printApplication();
        test.Interview(App3);

    }
}
