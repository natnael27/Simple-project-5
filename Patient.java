class Patient {
    private String name;
    private int age;
    private String disease;
    private Date dateOfAdmission;
    private Date dateOfDischarge;

    public Patient(String name, int age, String disease, Date dateOfAdmission, Date dateOfDischarge) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfDischarge = dateOfDischarge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public Date getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.print("Date of admission: ");
        dateOfAdmission.display();
        System.out.println();
        System.out.print("Date of discharge: ");
        dateOfDischarge.display();
        System.out.println("\n");
    }
}
