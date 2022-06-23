package tryexception;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			try
			{
				String b = " "+args[1];
				System.out.println(args.length);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			int a = 12/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
