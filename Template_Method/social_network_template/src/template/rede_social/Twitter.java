package template.rede_social;

public class Twitter extends SocialNetwork{

    public Twitter(String username, String password){
        super(username, password);
    }

    @Override
    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println("Logado no twitter");
            return true;
        }

        return false;
    }

    @Override
    public boolean sendData(String msg){
        System.out.println("Mensagem enviada no twitter: " + msg);

        return true;
    }

    @Override
    public void logout(){
        System.out.println("Deslogado do twitter");
    }

}
