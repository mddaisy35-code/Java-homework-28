public class Login {

 public static void main(String[] args) {

 String correctUsername = "admin";
 String correctPassword = "1234";

String username = "admin";
String password = "1111";

 try {

    System.out.println("Username: " + username);
    System.out.println("Password: " + password);

  if (!username.equals(correctUsername) ||
      !password.equals(correctPassword)) 
  {

    throw new Exception("Invalid Username or Password");
   }

    System.out.println("Login Successful");

  } 
    catch (Exception e) {

    System.out.println("Exception: " + e.getMessage());

   } 
 finally 
 {

    System.out.println("Login Process Completed");

        }
    }
}