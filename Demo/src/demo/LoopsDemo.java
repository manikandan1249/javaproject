package demo;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		System.out.println("for loop for normal");
		for(x=1;x<9;x++)
		{
			System.out.println(x);
		}
		int y[]=new int[4];
		System.out.println("for loop example for array");
		for(int z=0;z<y.length;z++)
		{
			y[z]=x;
			x++;
			System.out.println(y[z]);
		}
		System.out.println("enhanced loop");
		for (int u:y)
		{
			System.out.println(u);
		}
		System.out.println("string array print ");
		String str[]= {"dio","mock","go"};

		for (String u:str)  
		{
			System.out.println(u);
		}
}
}