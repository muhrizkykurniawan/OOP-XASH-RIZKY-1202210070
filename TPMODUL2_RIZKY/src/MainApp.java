public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Class Handphone");
        Handphone Handphone = new Handphone("sandisk",32, (float) 5.90, false);
        Handphone.information();
        Handphone.telp(628122109);
        Handphone.sms(628122109);
        Handphone.sms(628122109, 628172188);
        System.out.println("");

        System.out.println("Class Laptop");
        Laptop laptop = new Laptop("Corsair",32, (float)8.50, true);
        laptop.information();
        laptop.openGame("Grand Theft Auto 5");
        laptop.sendEmail("rizky05@gmail.com");
        laptop.Email("rizky05@gmail.com", "rizkyyyy@student.telkomuniversity.ac.id");
    }
        
    
}
