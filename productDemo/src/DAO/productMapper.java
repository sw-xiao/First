package DAO;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.product;

public interface productMapper {
   public List<product> getAll(@Param("i")int begin,@Param("j")int size);
    
   public int count();
   
   public int insert(product p);
   
   public int delete(int id);
}
