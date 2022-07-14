
public class Gold_Rate {

	public static void main(String[] args) {
		Gold_Rate GR= new Gold_Rate();
		GR.Compare();

	}

	private void Compare() {
		String[] Days= {"Monday","Tuesday","Wednesday"};
		int []Rate= {127,46,27};
		int High=Rate[0];
		int index=0;
		for(int i=0;i<Days.length;i++) {
			if(Rate[i]>Rate[0]) {
				High=Rate[i];
			index =i;
			}
			
		}System.out.println("Highest Gold Rate is "+ High+" on "+ Days[index]);
	}

}
