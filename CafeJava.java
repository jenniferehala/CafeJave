public class CafeJava {
    public static void main(String[] args){

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be read shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = " Your total is $";

        double mochaPrice = 3.5;
        int coffeePrice = 3;
        double lattePrice = 4.50;
        double cappucinoPrice = 2.50;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        if(isReadyOrder1 == true){
            System.out.println(customer1 +  readyMessage + displayTotalMessage + coffeePrice);
        }
        else{
            System.out.println(customer1 + pendingMessage);
        }

        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage + displayTotalMessage + (lattePrice += lattePrice));
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (lattePrice - coffeePrice));
    }
}