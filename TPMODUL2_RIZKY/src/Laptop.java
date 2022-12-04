public class Laptop extends Perangkat {
    protected boolean webcam_device;

    public Laptop(String drive_device, int ram_device, float processor_device, boolean webcam_device) {
        super(drive_device, ram_device, processor_device);
        this.webcam_device = webcam_device;
    }
    @Override
    public void information() {
        if (webcam_device==true) {
            String tersedia = ("tersedia");
        System.out.println("Laptop ini memiliki drive tipe "+drive_device+" dengan ram sebesar "+ram_device+" dan processor secepat "
        +processor_device+" Ghz. laptop ini "+tersedia+" webcam");}
        else if (webcam_device==false) {
            String tersedia = ("tidak tersedia");
        System.out.println("Laptop ini memiliki drive tipe "+drive_device+" dengan ram sebesar "+ram_device+" dan processor secepat "
        +processor_device+" Ghz. laptop ini "+tersedia+" webcam");
        }
    }
    public void openGame(String nama_game){
        System.out.println("open game "+nama_game);
    }
    public void sendEmail(String email){
        System.out.println("Send Email to "+email);
    }
    public void Email(String email, String email_2){
        System.out.println("Send Email to "+email+" and to "+email_2);
    }
    
}