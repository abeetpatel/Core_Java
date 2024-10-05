package abeet.patel.basi;

public class ElseIf {

	public static void main(String[] args) {
	 String id = "Abeet";
	 String password = "123";
	 if( id == null && password == null ) {
		 System.out.println(" ID or Password is empty");
		 }else if ( id == "Abeet" && password != "123") {
			 System.out.println(" Your password is incorrect");
			 }else if ( id != "Abeet" && password == "123") {
				 System.out.println(" Your id is incorrect");
			 }else if ( id != "Abeet" && password != "123") {
				 System.out.println(" Your id and password both are incorrect");
			 }else {
				 System.out.println(" Login Procces is done...");
			 }
	 

	}

}
