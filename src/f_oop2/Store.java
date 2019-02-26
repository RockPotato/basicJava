package f_oop2;

import java.util.Vector;


public class Store {

	
	public static void main(String[] args)
	{
		Customer c = new Customer();
		Desktop d = new Desktop();
		
		
		
		System.out.println(d.getInfo());
		Product l = new Laptop();
		System.out.println(l.getInfo());
		
		c.buy(d);
		c.showMoney();
		c.buy(l);
		c.showMoney();
		c.showItem();
		c.refund(d);
		c.showMoney();
		c.refund(d);
		c.showMoney();
		
	}
}

//여러가지 물건들이 공통으로 상속받을 수 있는 클래스를 만든다.
class Product
{
	int price;
	int point;
	//생성자에서 가격과 포인트를 초기화
	public Product(int price) {
		this.price=price;
		point=price/10;
	}
	//상품의 정보를 반환하는 메서드
	String getInfo(){
		return "가격 : " +price + "원 / 포인트 : "+point+" 점 ";
	}
	
}
class Desktop extends Product
{
	public Desktop() {
		//부모 클래스의 생성자 호출
		super(1000);
		
	}
	@Override
	String getInfo()
	{
		return "Desktop's "+super.getInfo(); //부모 클래스의 메서드 호출
		
	}
	public String toString(){
		return "Desktop";
	}
	
}
class Laptop extends Product
{
	public Laptop() {
		super(2000);
	}
	
	@Override
	String getInfo()
	{
		return "Laptop's "+super.getInfo();
	}
	public String toString(){
		return "Laptop";
	}
}

class Customer
{
	int money=10000;//명시적 초기화
	int point=0;
	Vector<Product> item=new Vector<Product>();

	//구매할때 받을 파라미터와 타입으로 물건들의 부모클래스를 지정해주면 자식클래스 모두 받을수 있다.
	
	void buy(Product p)
	{
		if(money<p.price)
		{
			System.out.println("잔돈이 부족하네 ");
			return;
		}
		money-=p.price;
		point += p.point;
		item.add(p);
		System.out.println(p+" !! 득템 !!");
	}
	void showItem(){
		String items = "아이템 목록 :";
		for(Product item : this.item)
		{
			items+= " " + item;
		}
		System.out.println(items);
	}
	void showMoney(){
		System.out.println("남은 돈 : "+money+"원 / 포인트 : "+point+" 점");
	}

	//문제1. 환불하는 메서드를 만들어주세요.
	
	void refund(Product p){
		if(item.remove(p))
		{
			money+=p.price;
			point-=p.point;
		}
		else
		{
			System.out.println("상품이 없습니다.");
		}
		
	}
	
	/*void buy(Product p)
	{
		if(money<p.price)
		{
			System.out.println("잔돈이 부족하네 ㅜㅜ");
			return;
		}
			this.money-=p.price;
			this.point+=p.point;
			System.out.println(p+ "!! 득템!!");
	}*/
}