package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123"); //POSITIVE TEST / SUNNY DAY SCENARIO
        loginVoid("cybertek", "answer"); //NEGATIVE TEST/ RAINY DAY SCENARIO
        login(" ", " ");
        //System.out.println(login("cybertekStudent", "abc123"));
        if (login("cybertekStudent", "abc123")) {
            System.out.println("Login successful, welcome to Canvas");
            System.out.println("Select the course to continue");
        } else {
            System.out.println("Login failed");
        }
        boolean isLoginSuccess = login("Nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if(login("nadir", "mountaint")) {
            System.out.println("Welcome to Canvas, select course or calendar");
    }else {
            System.out.println("Something wrong with your credentials");
    }

    }




    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("LOGIN SUCCESSFUL, WELCOME CybertekStudent!");
        } else {
            System.out.println("INCORRECT username or PASSWORD");
        }

    }
        public static boolean login (String userName, String password) {
            String secretUsername = "cybertekStudent";
            String secretPassword = "abc123";

            //       return userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword);
            if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
                return true; //return true, and exit method here. Return false will not run. Return means GET OUT
//               } else { //can be without else block!!
            }
                return false;
            }
        }














