class Service {
    private int id;
    private String name;
    private float price;
    private Clinic clinic;

    public Service(int id, String name, float price, Clinic clinic) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.clinic = clinic;
    }
}