package main.java.controllers;

// Mine :)
import main.java.media.Movie;
import main.java.service.TMDB_API_Handler;
import main.java.service.FileLoader;

// JavaFX
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;
import javafx.stage.DirectoryChooser;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

// Java
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

public class MainController {
    @FXML
    private TextField txt_cleaner_dir;

    @FXML
    private TableView<Movie> table_cleaner;

    @FXML
    private TableColumn<Movie, String> table_cleaner_title;

    @FXML
    private TableColumn<Movie, String> table_cleaner_netflix;

    @FXML
    private TableColumn<Movie, String> table_cleaner_hulu;

    @FXML
    private TableColumn<Movie, String> table_cleaner_disney;

    @FXML
    private TableColumn<Movie, String> table_cleaner_amazon;

    @FXML
    private ComboBox<String> cmb_codes;

    @FXML
    private ComboBox<String> cmb_format;

    @FXML
    public void initialize() {
        table_cleaner.getItems().clear();
        cmb_codes.getItems().clear();
        cmb_format.getItems().clear();

        ObservableList<String> options_codes = FXCollections.observableArrayList("GR", "US", "UK");
        ObservableList<String> options_format = FXCollections.observableArrayList("ShowName - S01E01 - EpisodeName", "ShowName - s01e01 - EpisodeName", "ShowName - 1x01 - EpisodeName");
        cmb_codes.getItems().addAll(options_codes);
        cmb_format.getItems().addAll(options_format);
    }

    private TMDB_API_Handler api;
    private FileLoader loader;

    public void showInfo() throws IOException {
        // In-Progress
    }

    public void getMovieList(ActionEvent event) {
        String[] fileList = loader.getFiles();

    }

    public void selectFolder(ActionEvent actionEvent) {
        final DirectoryChooser directoryChooser = new DirectoryChooser();
        loader.setDirectory(directoryChooser.showDialog(null));
        txt_cleaner_dir.setText(loader.getDirectory().toString());
    }
}
