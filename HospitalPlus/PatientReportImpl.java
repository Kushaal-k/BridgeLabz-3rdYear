package HospitalPlus;

public class PatientReportImpl implements IReportGenerator {
    private Patient patient;

    public PatientReportImpl(Patient patient){
        this.patient = patient;
    }

    @Override
    public void generateReport() 
    {
        System.out.println("---- Patient Report ----");
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Name: " + patient.getPatientName());
        System.out.println("Age: " + patient.getPatientAge());
    }
    
}
