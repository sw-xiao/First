package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.productService;

import pojo.product;

@Controller
public class ProductController {
	@Autowired
	private productService ps;

	public productService getPs() {
		return ps;
	}

	public void setPs(productService ps) {
		this.ps = ps;
	}

	@RequestMapping("/getAll")
	public String getAll(@RequestParam(defaultValue = "1") int pageindex,
			HttpServletRequest request) {
		if (pageindex < 1) {
			return "index.jsp";
		} else {
			// 第一步：一定要根据当前页码算出 启始条数
			int begin = (pageindex - 1) * 3;

			List<product> list = ps.getAll(begin, 3);

			request.getSession().setAttribute("list", list);

			request.getSession().setAttribute("pageindex", pageindex);

			int count = ps.count();

			int countpage = count % 5 == 0 ? count / 5 : count / 5 + 1;

			request.getSession().setAttribute("countpage", countpage);

			return "index.jsp";
		}
	}

	@RequestMapping("insert")
	public String insert(HttpServletRequest request,
			HttpServletResponse response) {
		String name = request.getParameter("productname");
		String Descs = request.getParameter("Descs");
		int cid = Integer.valueOf(request.getParameter("cid"));
		product p = new product();
		p.setProductname(name);
		p.setDescs(Descs);
		p.setCid(cid);
		ps.insert(p);
		return "index.jsp";
	}
	 @RequestMapping("delete")
	public String delete(HttpServletRequest request,int id){
		  
          ps.delete(id);
	         return "index.jsp";
	}
}
