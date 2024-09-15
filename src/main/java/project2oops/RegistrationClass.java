package project2oops;

public class RegistrationClass {
    private String username;
    private String email;
    private String password;

    public void setEmail(String email) {
        if ( !email.isEmpty() && email.endsWith("@yahoo.com")) {
            this.email=email;
            System.out.println(email);

        }else{
            System.out.println("Invalid email.");
        }
    }


    public void setUserName(String username) {
        if(!username.isEmpty() && username.length()>6) {
            this.username=username;
            System.out.println(username);
        }else{
            System.out.println("Username is incorrect");
        }
    }
    public void setPassword(String password) {
        if(!password.isEmpty() &&password.length()>6 &&!password.contains(username)) {
            this.password=password;
            System.out.println(password);

        }else{
            System.out.println("Password is incorrect");
        }
    }



    public static void main(String[] args) {

     RegistrationClass reg=new RegistrationClass();
     reg.setEmail("OksaP@yahoo.com");
     reg.setUserName("Syntax13");
     reg.setPassword("123456abc");
    }




}


