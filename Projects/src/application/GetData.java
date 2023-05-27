package application;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class GetData {   
	  
	 private Object getCellValue(Cell cell)
	    {
	        switch (cell.getCellType()) {
	        case STRING:
	            return cell.getStringCellValue();
	 
	        case BOOLEAN:
	            return cell.getBooleanCellValue();
	 
	        case NUMERIC:
	            return cell.getNumericCellValue();
	        }
	 
	        return null;
	    }
	  public API[] readBooksFromExcelFile( ) throws IOException
	    { 
	     	objects NoParent = new objects();
		    String str,cmp = "";
	        int i=0;
	        int  row_IO= 0;
	        String h ="";
	        ArrayList<objects> FinalData  = new ArrayList<objects>();
			FileInputStream inputstream=new FileInputStream(".\\datafiels\\Example2.xlsx" );
        	ArrayList<data> field  = new ArrayList<data>();
        	API api[] = new API[3];
	        Workbook workbook = new XSSFWorkbook(inputstream);
	        Sheet firstSheet = workbook.getSheetAt(0);	      
	        int rows=firstSheet.getLastRowNum();
         	data emp1 = new data();//for objects that are inherited
     	    
	    	for(int  l=0 ;l<=rows;l++)
			{ 
	        	Row nextRow = firstSheet.getRow(l);
	        if (nextRow != null ) {
	        	
	        	
	        	Cell cell0=nextRow.getCell(0);
	        	
	        	
	        	if (cell0 == null || cell0. getCellType() == CellType.BLANK) {
	        		
	        	}
	        	
	        	else {
	        		 h= (String)getCellValue(cell0); 
	        		 if((h.equals("I/o"))) {
	        			 API a= new API();
		        		 row_IO = cell0.getRowIndex();
		        		 row_IO++;
		        		 Row title=firstSheet.getRow(row_IO-6);
		     	         Cell n=title.getCell(0);
		     	         String thetitle =(String)getCellValue(n);
		     	         a.setname(thetitle);  
		        		 FinalData  = new ArrayList<objects>();
		        		 field  = new ArrayList<data>();
		        		 for(int r=row_IO;r<=rows;r++)
		     			{
		        		    NoParent.setname("No parent"); 	
		     	        	Row row=firstSheet.getRow(r);
		     	       
		     	        	if (row== null ) {
		     	        		
	     		        		break;
	     		        	}
		     	        	//Row nextRow = iterator.next();	        	
		     	        	objects object = new objects();
		     	        	data emp2 = new data();//for field

		  	            for(int c=0;c<5;c++)
		     				{
		     	            	 Cell cell=row.getCell(c);
		     	            	
		     	            	if (cell== null) {
		     		        		break;
		     		        	}
		     	            	
		     	            	 Cell cell2=row.getCell(2);
		     	            	 cmp = (String)getCellValue(cell2);              
		     	            	 if(!(cmp.equals("string"))) { 	               
		     					switch (c) {
		     	                case 0:
		     	               
		     	                	object.setIO((String)getCellValue(cell));

		     	                    break;
		     	                case 1:
		     	                	str=(String)getCellValue(cell); 
		                             if(str != null) {
		     						 String arrOfStr[] = str.split("/", 5);
		     					        int k=arrOfStr.length;
		                                 if(k>2) {				        	
		     					        	
		     					        	(object).setparent(arrOfStr[k-2]);
		     					        	object.setname(arrOfStr[k-1]);
		     					        
		                                 }
		     					        else    object.setname(arrOfStr[k-1]);			        
		     					          }
		                             
		     	                    break;
		     	                case 2:
		     	                	
		     	                	object.setType((String)getCellValue(cell)); 
		     	                
		     	                    break;
		     	                case 3:
		     	                	//object.setAllowedValues((String)getCellValue(cell));
		     	                	if(cell == null || cell. getCellType() == CellType.BLANK)
		     	                		object.setAllowedValues("All values are allowed");
		     	                	else
		     	                		object.setAllowedValues((String)getCellValue(cell));
		     	                    
		     	                    break;
		     	                case 4:
		     	                	
		     	                	object.setMandatory((String)getCellValue(cell));
		     	                	
		     	                    break;
		     	                	
		     	                }
		     	
		     				}
		     	            	 else {
		     	            		 
		     	            		 switch (c) {
		     	 	                case 0:
		     	 	               
		     	 	                	emp2.setIO((String)getCellValue(cell));
		     	 	                	
		     	 	                	

		     	 	                    break;
		     	 	                case 1:
		     	 	                	str=(String)getCellValue(cell); 
		     	                         if(str != null) {
		     	 						 String arrOfStr[] = str.split("/", 5);
		     	 					   int k=arrOfStr.length;
		     	 					 if(k>2) {	
		     	 					   emp2.setField_Name(arrOfStr[k-1]);
		     	 				       (emp2).setparent(arrOfStr[k-2]);
		     	 					 }
		     	 					 else emp2.setField_Name(arrOfStr[1]);
		     	 					        		
		     	                         }
		     	 	                    break;
		     	 	                case 2:
		     	 	                	emp2.setType((String)getCellValue(cell)); 
		     	 	                	
		     	 	                	
		     	 	                    break;
		     	 	               case 3:
		     		                	if(cell == null || cell. getCellType() == CellType.BLANK)
		     		                		emp2.setAllowedValues("All values are allowed");
		     		                	else
		     		                	emp2.setAllowedValues((String)getCellValue(cell));
		     		                    break;
		     	 	                case 4:
		     	 	                	
		     	 	                	emp2.setMandatory((String)getCellValue(cell));
		     	 	                	
		     	 	                	break;
		     	 	                	
		     	 	                }

		     	            	 }

		     	            	 }
		     	            
		     	           if(!(cmp.equals("string")))    
		     	           { 
		     	     
		     	        	   FinalData.add(object);	             
		     	      	             
		     	           }
		     	           else  field.add(emp2);
		     	           
		     	       
		     	        }
		     	       
		     	        
		     	        for(objects d :FinalData) {
		     	        	 for(data f :field) {
		     	        	    if(d.getname().equals(f.getparent())) {
		     	        	    	d.AddField(f);
		     	        	    }
		     	        	   
		     	        	   	        		
		     	        	 }
		     	        }
		     	       
		     	        for(objects d1 :FinalData) {
		     	        	 for(objects d2 :FinalData) {
		     	        		 //String names =d2.getparent();
		     	        		 if(d1.getname().equals(d2.getparent())) {
		     	        			 emp1.setType(d2.getType());
		     	        			 emp1.setMandatory(d2.getMandatory());
		     	        			 emp1.setIO(d2.getIO());
		     	        			 emp1.setField_Name(d2.getname());
		     	        			 emp1.setAllowedValues(d2.getAllowedValues());
		                           d1.AddField(emp1);
		                           emp1 = new data();
		     	        			 
		     	        		 }
		     	        		 
		     	        	 }
		     	        }
		        
		     	      
		     	       for(objects d :FinalData) {
			     	        a.Addobject(d);
		     	     
		     	        }
		     	      for(data f :field) {
		     	    	  
		     	   if(f.getparent() == null) 
		     		   NoParent.AddField(f);
		     		
		     	   
		     	      }
		     	     if(NoParent.printfields().length!=0)
		     	            a.Addobject(NoParent);
		     	    NoParent = new objects();
		     	      api[i]=a;
		     	      i++;   	       
		     	     
		    
		     	        }
	        		
		        		
		        	}
	        	
	     	
	        	}}
	        	return api;
	        	}
	       
	        	
	       
}