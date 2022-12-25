import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant restorant = new Restaurant();
        int customerID, orderQty;
        try{
            System.out.print("ID Pembeli: ");
            customerID = input.nextInt();
            System.out.print("berapa banyak pesanan anda : ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(restorant);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch(Exception l){
            System.out.println("Inputan harus berupa integer yaa");
        }
    }
}
