module com.example.project_part_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project_part_2 to javafx.fxml;
    exports com.example.project_part_2;
}