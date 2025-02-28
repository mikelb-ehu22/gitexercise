module eus.ehu.gitexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens eus.ehu.gitexercise to javafx.fxml;
    exports eus.ehu.gitexercise;
}