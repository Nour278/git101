module com.example.githubfirst {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.githubfirst to javafx.fxml;
    exports com.example.githubfirst;
}