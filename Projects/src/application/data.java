package application;

public class data {
	private String IO;
 	private String Field_Name;
 	private String Type ;
 	private String AllowedValues;
 	private String Mandatory;
 	private String parent;
	public data(){
		
	}
 	
 	@Override
 	public String toString() {
 		return " [ IO =" + IO + "  Field_Name =" + Field_Name + "   Type =" + Type + "   AllowedValues = " + AllowedValues
 				+ " Mandatory =" + Mandatory + "]\n";
 	}

 	public String getparent(){
 		return parent;
 	}
 	public void setparent(String parent) {
 		this.parent = parent;
 	}
 	
 	
 	public String getIO() {
 		return IO;
 	}
 	public void setIO(String iO) {
 		IO = iO;
 	}
 	public String getField_Name() {
 		return Field_Name;
 	}
 	public void setField_Name(String field_Name) {
 		Field_Name = field_Name;
 	}
 	public String getType() {
 		return Type;
 	}
 	public void setType(String string) {
 		Type = string;
 	}
 	public String getAllowedValues() {
 		return AllowedValues;
 	}
 	public void setAllowedValues(String allowedValues) {
 		AllowedValues = allowedValues;
 	}
 	public String getMandatory() {
 		return Mandatory;
 	}
 	public void setMandatory(String mandatory) {
 		Mandatory = mandatory;
 	}
 	

}
