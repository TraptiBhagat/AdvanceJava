package interfaceEx;



public class Test1 {
	public static void main(String[] args) {

		Richman rm = new Businessman();
		//SocialWorker sw = new Businessman();
		//Businessman bm = new Businessman();
		
		Person p=new Person();
		p.setName("ram");
		p.setAddress("155, Nyay Nagar");
		System.out.println(p.getAddress());
		System.out.println(p.getName());
	//bm.helpToOthers();
		rm.donation();
		rm.earnMoney();
		rm.party();
	}


}
