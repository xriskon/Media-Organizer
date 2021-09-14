package main.java.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.DirectoryChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import main.java.media.Media;
import main.java.service.FileLoader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainController {
    @FXML
    private VBox main;

    @FXML
    private TableView<Media> tbl_cleaner;

    @FXML
    private TextField txt_rnm_folder;

    @FXML
    private TextField txt_cln_folder;

    private FileLoader fileLoader;

    public void showAboutBox() throws IOException {
        File fxml = new File("src/main/resources/view/info.fxml");
        Image favicon = new Image("main/resources/images/icon.png");
        FXMLLoader loader = new FXMLLoader();

        // Create window
        loader.setLocation(fxml.toURI().toURL());
        Parent content = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(content);
        stage.setScene(scene);

        // Decorate window
        stage.setResizable(false);
        stage.getIcons().add(favicon);
        stage.setTitle("About");

        // Specifies the modality
        stage.initModality(Modality.WINDOW_MODAL);

        // Specifies the owner of window
        Stage primaryStage = (Stage) main.getScene().getWindow();
        stage.initOwner(primaryStage);

        stage.show();
    }

    public void btn_renamer() {

    }

    public void btn_cleaner() {
        // Select Folder
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(null);

        // TextField
        txt_cln_folder.setText(selectedDirectory.toString());

        // FileLoader
        fileLoader.setDirectory(selectedDirectory);
        File[] files = fileLoader.getFiles();

        // Clear table
        tbl_cleaner.getItems().clear();

        // For every item in file list
        for (File item:files) {
            // API request
            break;
        }

        // Load data
        ArrayList<Media> media = Media.getMedia();
        for (Media item:media) {
            tbl_cleaner.getItems().add(item);
        }
    }
}