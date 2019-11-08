public class PeopleTest {
	private String name;
	private int age;
	private double high;
	public PeopleTest() {
		//System.out.println("不带参数的方法被调用");
	}
		public PeopleTest(String a,int b,double c){
		 this.name=a ;
         this.age=b;
         this.high=c;
         }
	public void setname(String a) {
		this.name=a;
	}
	
	public String getname() {
		return name;
	}
	
	public void setage(int b) {
		this.age=b;
	}
	
	public int getage() {
		return age;
	}
	
	public void sethigh(double c) {
		this.high=c;
	}
	
	public double gethigh() {
		return high;
	}
    public static void main(String[] args) {
		PeopleTest 耳耳=new PeopleTest();
		
		耳耳.setname("耳耳");
		System.out.println("姓名为:"+耳耳.getname());
		
		耳耳.setage(19);
		System.out.println("年龄为:"+耳耳.getage());
		
		耳耳.sethigh(167.1);
		System.out.println("身高为:"+耳耳.gethigh());
	}

}
