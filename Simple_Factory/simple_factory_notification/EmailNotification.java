public class EmailNotification implements Notification{
    
    public EmailNotification(){

    }
    
    @Override
    public void notifyUser() {
        System.out.println("Notificando com Email");
    }
}
