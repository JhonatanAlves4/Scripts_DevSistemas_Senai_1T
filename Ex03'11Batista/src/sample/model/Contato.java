package sample.model;

public class Contato {

    //Atributo
    private String zap;
    private String email;
    private String twitter;

    //Getter and setter

    public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        this.zap = zap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String toString() {
        return "Zap: " + zap+ "\n" +
                "Email: " + email + "\n"
                + "Twitter: " + twitter;
    }
}
