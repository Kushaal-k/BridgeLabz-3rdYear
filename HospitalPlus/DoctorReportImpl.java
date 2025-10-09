package HospitalPlus;

public class DoctorReportImpl implements IReportGenerator {
    private Doctor doctor;

    public DoctorReportImpl(Doctor doctor){
        this.doctor = doctor;
    }

    @Override
    public void generateReport() 
    {
        System.out.println("---- Doctor Report ----");
        System.out.println("Doctor ID: " + doctor.getDoctorId());
        System.out.println("Name: " + doctor.getDoctorName());
        System.out.println("Specialization: " + doctor.getDoctorSpecialization());
        System.out.println("Availability: " + (doctor.getDoctorAvailability() ? "Available" : "Not Available"));
    }
}
