import com.sun.javafx.scene.control.skin.DatePickerSkin;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafxapplication2.CalendarEvent;

/**
 *
 * @author Aaron Yeh
 */
public class JavaFXApplication2 extends Application
{
    static String currentYear;
    static String currentMonth;
    HashMap<String, ArrayList<CalendarEvent>> eventMap = new HashMap<String, ArrayList<CalendarEvent>>();
//    static String sampleDate = "2021-November-29";
    

    @Override
    public void start(Stage primaryStage)
    {
        
        
        DatePicker datePicker = new DatePicker(LocalDate.now());
        DatePickerSkin datePickerSkin = new DatePickerSkin(datePicker);
        Node popupContent = datePickerSkin.getPopupContent();
        
     
//        System.out.println(sampleDate);
//        CalendarEvent sampleEvent = new CalendarEvent("sampleName", 11, 30, "Big L");
//        if (eventMap.get(sampleDate) == null) {
//            eventMap.put(sampleDate, new ArrayList<CalendarEvent>());
//        }
//        eventMap.get(sampleDate).add(sampleEvent);
//        
        
        int i = 0;
        for (Node node : popupContent.lookupAll(".spinner-label")) {
            String monthOrYear = String.format("\t" + node);
            String[] monthSubStrings = monthOrYear.split("'");
            monthOrYear = monthSubStrings[1];
            //System.out.println(monthOrYear);
            if (i == 0){
                currentMonth = monthOrYear;
            } else{
                currentYear = monthOrYear;
            }
            i = i+1;
        }
       
        //To see day of the week nodes
        for (Node node : popupContent.lookupAll(".day-cell")) {
            node.setOnMouseClicked((event) -> {
                DateCell dateCell = (DateCell) node;
                String formattedDate = currentYear + "-" + currentMonth + "-" + dateCell.getText();
                /*
                if (formattedDate.equals(sampleDate)){
                    System.out.println("equals");
                } else{
                    System.out.println("does not equal");
                }
                */
//                System.out.println(formattedDate);
//                System.out.println(eventMap.keySet());
//                System.out.println(formattedDate.equals("2021-November-29"));
                ArrayList<CalendarEvent> eventList = eventMap.get(formattedDate);
//                
//                if (eventList == null){
//                    System.out.println("null");
//                } else{
//                    System.out.println("not null");
//                }
//                
                
                Button backButton = new Button();
                Button addEventButton = new Button();
                backButton.setText("Back");
                backButton.setOnAction(new EventHandler<ActionEvent>() {
                   
                    @Override
                    public void handle(ActionEvent event) {
                        StackPane root = new StackPane(popupContent);
                        Scene scene = new Scene(root, 300, 250);

                        primaryStage.setTitle("Hello World!");
                        primaryStage.setScene(scene);
                        primaryStage.show();
                    }
                });
                addEventButton.setText("+");
                addEventButton.setOnAction(new EventHandler<ActionEvent>() {
                   
                    @Override
                    public void handle(ActionEvent event) {
                        //Creating a GridPane container
                        GridPane grid = new GridPane();
                        grid.setPadding(new Insets(10, 10, 10, 10));
                        grid.setVgap(5);
                        grid.setHgap(5);
                        //Defining the Name text field
                        final TextField name = new TextField();
                        name.setPromptText("Enter The Event Name");
                        name.setPrefColumnCount(10);
                        name.getText();
                        GridPane.setConstraints(name, 0, 0);
                        grid.getChildren().add(name);
                        //Defining the Last Name text field
                        final TextField time = new TextField();
                        time.setPromptText("Enter The Time");
                        GridPane.setConstraints(time, 0, 1);
                        grid.getChildren().add(time);
                        //Defining the Comment text field
                        final TextField note = new TextField();
                        note.setPrefColumnCount(15);
                        note.setPromptText("Enter The Notes");
                        GridPane.setConstraints(note, 0, 2);
                        grid.getChildren().add(note);
                        //Defining the Submit button
                        Button submit = new Button("Submit");
                        GridPane.setConstraints(submit, 1, 0);
                        grid.getChildren().add(submit);
                        submit.setOnAction(e ->{
                            
                            CalendarEvent newEvent = new CalendarEvent(name.getText(), time.getText(), note.getText());
                            if (eventMap.get(formattedDate) == null) {
                                eventMap.put(formattedDate, new ArrayList<CalendarEvent>());
                            }
                            eventMap.get(formattedDate).add(newEvent);
                            HBox eventHandler = new HBox();
                            if (null != eventMap.get(formattedDate)){
                                
                                
                                int m = 0;                           
                                while (m < eventMap.get(formattedDate).size()){

                                    Label label = new Label();
                                    label.setText("Event Name: " + eventMap.get(formattedDate).get(m).getEventName());
                                    Label label1 = new Label();
                                    label1.setText("Time: " + eventMap.get(formattedDate).get(m).getTime());
                                    Label label2 = new Label();
                                    label2.setText("Notes: " + eventMap.get(formattedDate).get(m).getNotes());

                                    eventHandler.getChildren().addAll(label, label1, label2);   
                                    eventHandler.setSpacing(20);
                                    
                                    Button removeEvent = new Button();
                                    removeEvent.setOnAction(n ->{
                                        //CalendarEvent removedEvent = eventMap.get(formattedDate).remove(m);
                                    });
                                    m++;
                                }
                                
                            }


                            addEventButton.setTranslateX(225);
                            HBox topMenu = new HBox();
                            topMenu.getChildren().addAll(backButton, addEventButton);
                            BorderPane borderPane = new BorderPane();
                            borderPane.setTop(topMenu);
                            borderPane.setCenter(eventHandler);
                            Scene scene = new Scene(borderPane, 300, 250);

                            primaryStage.setTitle("Hello World!");
                            primaryStage.setScene(scene);
                            primaryStage.show();

                        });
                        
                        Scene scene = new Scene(grid, 300, 250);

                        primaryStage.setTitle("Hello World!");
                        primaryStage.setScene(scene);
                        primaryStage.show();
                    }
                });
            
              
                HBox eventHandler = new HBox();
                if (null != eventMap.get(formattedDate)){
                    
                
                    int m = 0;
                    while (m < eventMap.get(formattedDate).size()){
                        Label label = new Label("Event Name: ");
                        label.setText(eventMap.get(formattedDate).get(m).getEventName());
                        Label label1 = new Label("Time: ");
                        label1.setText(eventMap.get(formattedDate).get(m).getTime());
                        Label label2 = new Label("Notes: ");
                        label2.setText(eventMap.get(formattedDate).get(m).getNotes());

                        eventHandler.getChildren().addAll(label, label1, label2);   
                        eventHandler.setSpacing(20);
                        m++;
                    }

                }

                
                addEventButton.setTranslateX(225);
                HBox topMenu = new HBox();
                topMenu.getChildren().addAll(backButton, addEventButton);
                BorderPane borderPane = new BorderPane();
                borderPane.setTop(topMenu);
                borderPane.setCenter(eventHandler);
                Scene scene = new Scene(borderPane, 300, 250);

                primaryStage.setTitle("Hello World!");
                primaryStage.setScene(scene);
                primaryStage.show();
        
            });
        }
        
        for (Node node : popupContent.lookupAll(".left-button")) {
            node.setOnMouseClicked((event) -> {
                int n = 0;
                for (Node node1 : popupContent.lookupAll(".spinner-label")) {
                    String monthOrYear = String.format("\t" + node1);
                    String[] monthSubStrings = monthOrYear.split("'");
                    monthOrYear = monthSubStrings[1];
                    if (n == 0){
                        currentMonth = monthOrYear;
                    } else{
                        currentYear = monthOrYear;
                    }
                    n = n+1;
                }
            });
        }
        
        for (Node node : popupContent.lookupAll(".right-button")) {
            node.setOnMouseClicked((event) -> {
                int n = 0;
                for (Node node1 : popupContent.lookupAll(".spinner-label")) {
                    String monthOrYear = String.format("\t" + node1);
                    String[] monthSubStrings = monthOrYear.split("'");
                    monthOrYear = monthSubStrings[1];
                    if (n == 0){
                        currentMonth = monthOrYear;
                    } else{
                        currentYear = monthOrYear;
                    }
                    n = n+1;
                }
            });
        }
        
        
     
            
        
        //To see all nodes. Used to find out how to look up certain nodes
        
        StackPane root = new StackPane(popupContent);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    private class events extends StackPane{
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    

}