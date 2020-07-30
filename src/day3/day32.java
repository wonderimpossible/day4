package day3;

public class day32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 19;
		for(int b =2;b<a;b++)
		{
			if(a%b==0)
			{
				//被整除
				System.out.println("不是质数");
				//return;
				break;
			}
		}
		//break到这了 
		System.out.println("是质数");
	}

}
