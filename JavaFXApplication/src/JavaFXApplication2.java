import com.sun.javafx.scene.control.skin.DatePickerSkin;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Aaron Yeh
 */
public class JavaFXApplication2 extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
        DatePicker datePicker = new DatePicker(LocalDate.now());
        DatePickerSkin datePickerSkin = new DatePickerSkin(datePicker);
        Node popupContent = datePickerSkin.getPopupContent();

        //To see day of the week nodes
        for (Node node : popupContent.lookupAll(".day-name-cell")) {
            node.setOnMouseClicked((event) -> {
                DateCell dateCell = (DateCell) node;
            });
        }

        //To see all nodes. Used to find out how to look up certain nodes
       

        StackPane root = new StackPane(popupContent);
        Scene scene = new Scene(root, 600, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    private class dayViewer extends StackPane{
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

}