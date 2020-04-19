import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public enum References {
    // FXML
    MAIN("/fxml/Main.fxml", "Main"),

    // CSS
    STYLESHEET("/css/stylesheet.css", "Stylesheet");

    private String filePath, name;

    References(String filePath, String name) {
        this.filePath = filePath;
        this.name = name;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getName() {
        return name;
    }

    public void goTo() throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource(filePath));
        page.getStylesheets().add(STYLESHEET.getFilePath());
        Scene scene = new Scene(page);
        Stage window = Main.primaryStage;
        window.setScene(scene);
        window.show();
    }
}
