package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(1);
		seller.setName("Pericles");
		seller.setEmail("pericles@email.com");
		sellerDao.update(seller);
	}

}
