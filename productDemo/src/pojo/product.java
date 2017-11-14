package pojo;

public class product {
	public product() {
	}

	public product(int id, String productname, String descs, int cid) {
		super();
		this.id = id;
		this.productname = productname;
		Descs = descs;
		this.cid = cid;
	}

	private int id;
	private String productname;
	private String Descs;
	private int cid;
	private catagory catagory;

	public catagory getCatagory() {
		return catagory;
	}

	public void setCatagory(catagory catagory) {
		this.catagory = catagory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDescs() {
		return Descs;
	}

	public void setDescs(String descs) {
		Descs = descs;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

}