import java.util.ArrayList;

class Hospital {
    private ArrayList<Patient> patients;

    public Hospital() {
        patients = new ArrayList<Patient>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void deletePatient(Patient patient) {
        patients.remove(patient);
    }

    public void displayAllPatients() {
        for (Patient patient : patients) {
            patient.display();
        }
    }

    public void displayPatientsUnder12() {
        for (Patient patient : patients) {
            if (patient.getAge() < 12) {
                patient.display();
            }
        }
    }
}
