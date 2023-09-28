class Patient {
    private int id;
    private String name;
    private Doctor doctor;

    public Patient(int id, String name, Doctor doctor) {
        this.id = id;
        this.name = name;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}