class Doctor {
    private int id;
    private String name;
    private String specialization;
    private Clinic clinic;

    public Doctor(int id, String name, String specialization, Clinic clinic) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.clinic = clinic;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public String getName() {
        return name;
    }
}