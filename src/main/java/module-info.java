module test.x6_bmi_calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens test.x6_bmi_calculator to javafx.fxml;
    exports test.x6_bmi_calculator;
}
