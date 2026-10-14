public class LogicCheck {
    public void getLogit(){
        final String username ="Kagiso12";
        final String password = "KaGis0";
        String inputuser = "Kagiso12";
        String inputpass = "Ka9is0";

        if(inputuser.equals(username) && inputpass.equals(password) ){
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
        System.out.println("-----End of lab---------");
    }
}
