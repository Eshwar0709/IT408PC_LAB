import java.util.Scanner;
class ExceptionMain{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			int age=sc.nextInt();
			if(age<18){
				throw new AgeException("Sorry you are not Eligible for Voting");
			}
			else{
				System.out.println("Please cast your Vote");
			}
		}catch(AgeException ae){
			System.out.println(ae.getMessage());
		}
	}
}
class AgeException extends Exception{
	public AgeException(String msg){
		super(msg);
	}
}
