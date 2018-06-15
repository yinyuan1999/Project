package com.yy.model;

public class Gtype {   
    private String typeame;   
    private int typeid;
  

	public String getTypeame() {
		return typeame;
	}
	public void setTypeame(String typeame) {
		this.typeame = typeame;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public Gtype() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Gtype [typeame=" + typeame + ", typeid=" + typeid + "]";
	}
	
	public Gtype(String typeame, int typeid) {
		super();
		this.typeame = typeame;
		this.typeid = typeid;
	}
	

      

}
