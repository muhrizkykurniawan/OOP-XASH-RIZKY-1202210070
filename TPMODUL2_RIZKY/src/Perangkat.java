public class Perangkat{
    protected String drive_device;
    protected int ram_device;
    protected double processor_device;

    public Perangkat(String drive_device, int ram_device, double processor_device) {
        this.drive_device = drive_device;
        this.ram_device =  ram_device;
        this.processor_device = processor_device;
    }

    public void information() {
        System.out.println("Perangkat tidak diketahui memiliki drive tipe" +drive_device+ "dengan ram sebesar " +ram_device+"GB dan prosesor secepat" + processor_device+"Ghz");
    }
}