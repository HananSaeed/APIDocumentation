package application;

import java.util.ArrayList;
import java.util.List;



public class objects  extends data
{
	private String name;
 	private ArrayList<data> field = new ArrayList<data>();
    public objects() {
    	setField(new ArrayList<data>());
 	}

 	public String getname() {
 		return name;
 	}
 	public void setname(String field_Name) {
 		name = field_Name;
 	}
	
	public void AddField(data f) {
	  		this.getField().add(f);
	  	}

	public String [] printfields() {
	  		String[] s = new String[getField().size()];
	  		
	  			
	  			for(int i=0; i< getField().size() ; i++) {
	  			//System.out.println("Fields:");
	  			s[i] = getField().get(i).getField_Name()+"\n" + getField().get(i).getAllowedValues() + "\n" + getField().get(i).getMandatory()+ "\n";
	  		}
	  		return s;
	  	}

	public ArrayList<data> getField() {
		return field;
	}

	public void setField(ArrayList<data> field) {
		this.field = field;
	}
 	public String printparent() {
  		return   this.name;
  		
  	}
    
}