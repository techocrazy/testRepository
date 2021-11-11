
public class LargestDivisorFrom1to10 {

	public static void main(String[] args) {

		int n = 100;
		int count = 0;
		for(int i = 1; i < 10; i++)
		{
			if(n%i == 0)
			{
				count = i;
			}
		}
		System.out.println(count);
	}

}
