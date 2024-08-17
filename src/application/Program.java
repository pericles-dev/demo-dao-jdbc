package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department department = new Department(2, null);
		Seller seller = new Seller(null, "Greg", "greg@email.com", new Date(), 4000.0, department);

		sellerDao.insert(seller);
	}

}
