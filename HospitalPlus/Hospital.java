package HospitalPlus;

public class Hospital {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("D001", "Dr. Smith", "Cardiology", true);
        Patient patient1 = new Patient("P001", "John Doe", 45);
        Appointment appointment1 = new Appointment("A001", doctor1, patient1, "2024-10-15", "10:00 AM", "Pending");
        appointment1.CreateAppointment();

        IReportGenerator patientReport = new PatientReportImpl(patient1);
        IReportGenerator appointmentReport = new AppointmentReportImpl(appointment1);
        IReportGenerator doctorReport = new DoctorReportImpl(doctor1);
        
        patientReport.generateReport();
        doctorReport.generateReport();
        appointmentReport.generateReport();
    }
}
