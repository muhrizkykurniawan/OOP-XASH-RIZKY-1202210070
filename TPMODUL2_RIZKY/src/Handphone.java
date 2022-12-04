public class Handphone extends Perangkat{
    protected boolean fingerprint_device;
    
    public Handphone(String drive_device, int ram_device, float processor_device, boolean fingerprint_device){
        super(drive_device, ram_device, processor_device);
        this.fingerprint_device = fingerprint_device;
    }
    @Override
    public void information(){
        if (fingerprint_device==true){
            String finger =("memiliki");
            System.out.println("Handphone ini memiliki drive tipe " + drive_device +" "+ "ram sebesar " +ram_device + " dan processor secepat " + processor_device + 
" Ghz. Handphone ini "+finger+ " fingerprint");
    }
        else if(fingerprint_device==false){
            String finger = ("tidak memiliki");
            System.out.println("Handphone ini memiliki drive tipe " + drive_device +" "+ "ram sebesar " +ram_device + " dan processor secepat " + processor_device + 
" Ghz. Handphone ini "+finger+ " fingerprint");}
}
        public void telp(int no_hp){
        System.out.println("Handphone telah berhasil menyambungkan telpon ke No "+no_hp);
    }
    public void sms(int no_hp){
        System.out.println("Handphone telah berhasil mengirimkan sms ke No "+no_hp);
    }
    public void sms(int no_hp, int no_hp2){
        System.out.println("Handphone telah berhasil mengirimkan telpon ke No "+no_hp + " dan ke No "+no_hp2);
    }    

}