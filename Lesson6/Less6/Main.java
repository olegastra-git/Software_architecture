public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(1, "My Clinic", "123 Main St");
        Doctor doctor = new Doctor(1, "Dr. Smith", "Dentist", clinic);
        Service service = new Service(1, "Tooth Extraction", 100.0f, clinic);
        Patient patient = new Patient(1, "John Doe", doctor);
        // Вывод информации о пациенте
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + patient.getDoctor().getName());
        System.out.println("Clinic: " + patient.getDoctor().getClinic().getName());
    }
}