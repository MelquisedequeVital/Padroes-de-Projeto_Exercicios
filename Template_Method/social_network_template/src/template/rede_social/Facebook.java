package template.rede_social;

public class Facebook extends SocialNetwork {

    public Facebook(String username, String password){
        super(username, password);
    }

    @Override
    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println("Logado no facebook");
            return true;
        }

        return false;
    }

    @Override
    public boolean sendData(String msg){
        System.out.println("Mensagem enviada no facebook: " + msg);

        return true;
    }


    @Override
    public void logout(){
        System.out.println("Deslogado do facebook");
    }

}
