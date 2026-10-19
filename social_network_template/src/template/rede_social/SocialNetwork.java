package template.rede_social;

public abstract class SocialNetwork {
    protected String username;
    protected String password;

    public SocialNetwork(String username, String password){
        this.password = password;
        this.username = username;
    }

    public abstract boolean login(String Username, String password);

    public abstract boolean sendData(String data);

    public abstract void logout();

    public void post(String msg, String username, String pwd){
        if(login(username, pwd)){
            sendData(msg);
            logout();
        } else {
            System.out.println("Credenciais inválidas");
        }
    }
}
