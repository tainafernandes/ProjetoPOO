package entities;

public class Rent {

    private String name;
    private String email;

    public Rent(String name, String email){ //Contructor
        this.name = name;
        this.email = email;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return name + ", " + email;
    }
}
