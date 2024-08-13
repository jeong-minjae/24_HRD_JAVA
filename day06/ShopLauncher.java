package day06;

public class ShopLauncher {

	public static void main(String[] args) {
		Ishop shop =new Myshop();
		shop.setTitle("MYSHOP");
		shop.genuser();
		shop.genproduct();
		shop.start();

	}

}
