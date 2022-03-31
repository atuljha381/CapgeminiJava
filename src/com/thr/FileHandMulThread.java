package com.thr;

public class FileHandMulThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		try {
//			ArrayList<Product> prodList = new ArrayList<Product>();
//			FileReader reader = new FileReader("D:\\Eclipse-Workspace\\JavaApp1\\src\\product.txt");
//			BufferedReader buffer = new BufferedReader(reader);
//			String lineString = "";
//			while ((lineString = buffer.readLine()) != null) {
//				String[] productDetail = lineString.split(",");
//				int id = Integer.parseInt(productDetail[0]);
//				String name = productDetail[1];
//				int cost = Integer.parseInt(productDetail[2]);
//				prodList.add(new Product(id, cost, name));
//			}
//			Predicate<Product> cond1 = p -> p.getCost() > 25000;
//			Consumer<Product> output1 = Product::showProd;
//
////			prodList.stream().forEach(output1);
//			for (Object a : prodList) {
//				System.out.println("Product ID: " + );
//				Thread.sleep(500);
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileHandMulThread thread = new FileHandMulThread();
		Thread thr = new Thread(thread);
		thr.start();
	}

}
