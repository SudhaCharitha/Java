package javaprgms;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i values are");
		for(int i=0;i<=10;i++)
		{
			if(i==6)
				break;
			System.out.println(i);

	}
		System.out.println("J values are");
		for(int j=0;j<=10;j++)
		{
			if(j==6)
				continue;
			System.out.println(j);

	}
	}
}
