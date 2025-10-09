package HospitalPlus;

public class Patient {
    private String patientId;
    private String patientName;
    private int patientAge;

    public Patient(String patientId, String patientName, int patientAge) 
    {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
    }

    public String getPatientName(){
        return patientName;
    }

    public int getPatientAge(){
        return patientAge;
    }
    
    public String getPatientId(){
        return patientId;
    }

}
