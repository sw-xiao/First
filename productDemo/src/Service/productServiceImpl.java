package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.product;
import DAO.productMapper;
@Service("hs")
public class productServiceImpl implements productService{
	  @Autowired
	  private productMapper pm;
	  
      public productMapper getPm() {
		return pm;
	}
	public void setPm(productMapper pm) {
		this.pm = pm;
	}	
	public List<product> getAll(int begin, int size) {
	
		return pm.getAll(begin, size);
	}
	public int insert(product p) {
		// TODO Auto-generated method stub
		return pm.insert(p);
	}
	public int count() {
		// TODO Auto-generated method stub
		return pm.count();
	}
	public int delete(int id) {
		// TODO Auto-generated method stub
		return pm.delete(id);
	}	
}
