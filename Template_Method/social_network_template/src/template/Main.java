package template;

import template.rede_social.SocialNetwork;
import template.rede_social.Twitter;

public class Main {
    public static void main(String[] args) throws Exception {
        SocialNetwork redeSocial = new Twitter("mel", "123");

        redeSocial.post("Socorro", "mel", "12");

    }
}
