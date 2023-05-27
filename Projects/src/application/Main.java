package application;
	
import java.io.IOException;
import java.util.ArrayList;
import application.GetData;
import application.objects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		
		
		 try {
			 GetData getContentFromExcelSheets = new GetData();
			 ListView<objects> mListView = new ListView();
			 API[] folder= new API[3]; 
			 ArrayList<objects> included= new ArrayList<objects>();
			folder= getContentFromExcelSheets.readBooksFromExcelFile();
		 
            included = folder[0].getobject();
			for(objects d :included) {
				mListView.getItems().add(d);
			}
		

		    mListView.setCellFactory((ListView<objects> ara) -> {
            ListCell<objects> cell = new ListCell<objects>() {                
                @Override
                protected void updateItem(objects item, boolean empty) {
                    super.updateItem(item, empty);
                    if (item != null) {
                        setText(item.getname());
                    } else {
                        setText("");
                    }
                }
            };

            return cell;
        });   
         mListView.setPrefSize(90, 300);   
         TextArea description = new TextArea();
        description.setMaxSize(300, 400);
        description.setWrapText(true); 
        
        mListView.getSelectionModel().selectedItemProperty().addListener((obs, oldObject, newObject) -> {
        	
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<newObject.printfields().length;i++) {
      stringBuilder.append(newObject.getField().get(i).getField_Name()).append(System.lineSeparator()).append(newObject.getField().get(i).getAllowedValues()).append(System.lineSeparator()).append(newObject.getField().get(i).getMandatory()).append(System.lineSeparator());  
            stringBuilder.append(System.lineSeparator());        
            }
            description.setText(stringBuilder.toString());
        
        });
        
  
        VBox vbox = new VBox();
        Label heading = new Label(folder[0].getname());
        heading.setFont(new Font("Times new Roman", 20));

        HBox layout = new HBox(mListView, description);

        vbox.getChildren().addAll(heading, layout);

        Scene scene = new Scene(vbox, 420, 250);

        primaryStage.setScene(scene);

        primaryStage.show();
if(folder[1] != null) {
	mListView = new ListView();
	Stage primaryStage1= new Stage();
	   included = folder[1].getobject();
				for(objects d :included) {
					mListView.getItems().add(d);
				}
			

			    mListView.setCellFactory((ListView<objects> ara) -> {
	            ListCell<objects> cell = new ListCell<objects>() {                
	                @Override
	                protected void updateItem(objects item, boolean empty) {
	                    super.updateItem(item, empty);
	                    if (item != null) {
	                        setText(item.getname());
	                    } else {
	                        setText("");
	                    }
	                }
	            };

	            return cell;
	        });   
	         mListView.setPrefSize(90, 300);   
	         TextArea description1 = new TextArea();
	        description1.setMaxSize(300, 400);
	        description1.setWrapText(true); 
	        
	        mListView.getSelectionModel().selectedItemProperty().addListener((obs, oldObject, newObject) -> {
	        	
	            StringBuilder stringBuilder = new StringBuilder();
	            for(int i=0;i<newObject.printfields().length;i++) {
	      stringBuilder.append(newObject.getField().get(i).getField_Name()).append(System.lineSeparator()).append(newObject.getField().get(i).getAllowedValues()).append(System.lineSeparator()).append(newObject.getField().get(i).getMandatory()).append(System.lineSeparator());  
	            stringBuilder.append(System.lineSeparator());        
	            }
	            description1.setText(stringBuilder.toString());
	        
	        });
	        
	  
	        VBox vbox1 = new VBox();
	        Label heading1 = new Label(folder[1].getname());
	        heading1.setFont(new Font("Times new Roman", 20));

	        HBox layout1 = new HBox(mListView, description1);

	        vbox1.getChildren().addAll(heading1, layout1);

	        Scene scene1 = new Scene(vbox1, 420, 250);

	        primaryStage1.setScene(scene1);

	        primaryStage1.show();
}
if(folder[2] != null) {
	mListView = new ListView();
	Stage primaryStage2= new Stage();
	   included = folder[2].getobject();
				for(objects d :included) {
					mListView.getItems().add(d);
				}
			

			    mListView.setCellFactory((ListView<objects> ara) -> {
	            ListCell<objects> cell = new ListCell<objects>() {                
	                @Override
	                protected void updateItem(objects item, boolean empty) {
	                    super.updateItem(item, empty);
	                    if (item != null) {
	                        setText(item.getname());
	                    } else {
	                        setText("");
	                    }
	                }
	            };

	            return cell;
	        });   
	         mListView.setPrefSize(90, 300);   
	         TextArea description2 = new TextArea();
	        description2.setMaxSize(300, 400);
	        description2.setWrapText(true); 
	        
	        mListView.getSelectionModel().selectedItemProperty().addListener((obs, oldObject, newObject) -> {
	        	
	            StringBuilder stringBuilder = new StringBuilder();
	            for(int i=0;i<newObject.printfields().length;i++) {
	      stringBuilder.append(newObject.getField().get(i).getField_Name()).append(System.lineSeparator()).append(newObject.getField().get(i).getAllowedValues()).append(System.lineSeparator()).append(newObject.getField().get(i).getMandatory()).append(System.lineSeparator());  
	            stringBuilder.append(System.lineSeparator());        
	            }
	            description2.setText(stringBuilder.toString());
	        
	        });
	        
	  
	        VBox vbox2 = new VBox();
	        Label heading2 = new Label(folder[2].getname());
	        heading2.setFont(new Font("Times new Roman", 20));

	        HBox layout2 = new HBox(mListView, description2);

	        vbox2.getChildren().addAll(heading2, layout2);

	        Scene scene2 = new Scene(vbox2, 420, 250);

	        primaryStage2.setScene(scene2);

	        primaryStage2.show();
}
		 
		 }
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	
	public static void main(String[] args) {

		
	launch(args);
}
	}
