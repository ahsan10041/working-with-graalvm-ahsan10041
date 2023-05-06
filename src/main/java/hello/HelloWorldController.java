package hello;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorldController {

    @FXML
    private Label sysInfoLabel;

    @FXML
    private void initialize() {
        var sysInfo = Stream.of(
                        "user.name",
                        "user.home",
                        "os.name",
                        "os.arch",
                        "os.version",
                        "javafx.version",
                        "java.vm.name",
                        "java.vm.version",
                        "java.vm.vendor")
                .map(s -> String.format("%s: %s", s, System.getProperty(s)))
                .collect(Collectors.joining("\n"));
        sysInfoLabel.setText(sysInfo);
    }

}
