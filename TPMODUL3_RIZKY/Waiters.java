public class Waiters implements Runnable{
    private final int customerID;
    private final int orderQty;
    static int foodPrice = 25000;
    
    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run(){
        while (true) {
            getFood();
            try{
                Thread.sleep(15000);
            }catch(InterruptedException l){
                l.printStackTrace();
            }
        }
    }

    public void orderInfo(){
        System.out.println("======================================================");
        System.out.println("ID : " + this.customerID);
        System.out.println("Jumlah : " + this.orderQty);
        System.out.println("Total: " + this.orderQty * foodPrice);
        System.out.println("======================================================");
    }
    public void getFood() {
        synchronized(Restaurant.getLock()){
            System.out.println("sudah siap untuk di kirim");
            Restaurant rs = new Restaurant();
            rs.setWaitingForPickup(false);
            if (Restaurant.getfoodNumber() == this.orderQty + 1){
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("membuat makanan yang lain \n");
        }
    }
}
