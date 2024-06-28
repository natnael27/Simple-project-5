public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(2023, 5, 6);
        Date date2 = new Date(2023, 5, 9);
        Date date3 = new Date(2023, 5, 12);
        Date date4 = new Date(2023, 5, 15);

        Patient patient1 = new Patient("Natnael", 22, "Technophobia", date1, date2);
        Patient patient2 = new Patient("Son", 11, "Cibophobia", date2, date3);
        Patient patient3 = new Patient("Mark", 28, "Stress", date3, date4);

        Hospital hospital = new Hospital();
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        System.out.println("All patients:");
        hospital.displayAllPatients();

        System.out.println("Patients under 12:");
        hospital.displayPatientsUnder12();
    }
}
