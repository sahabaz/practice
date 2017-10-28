package demo;

public class Normal 
{
		private int amt=10000;
	
	
	public int getAmt() 
	{
		return amt;
	}


//	public void setAmt(int amt) 
//	{
//		this.amt = amt;
//	}


	public static void main(String[] args) 
	{
		Normal d = new Normal();
//		d.setAmt(20000);
		System.out.println(d.getAmt());

	}

}
