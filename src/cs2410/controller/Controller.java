package cs2410.controller;

import cs2410.view.View;
import javafx.fxml.FXML;

public class Controller {
    View view = new View();

    @FXML
    private void pressedStart() {
        System.out.println("Pressed Start");
    }

    public void clickedCell() {
        //mark as clicked
        //update all cells
        //check won
        //check lost
        
    }

    public void clickedReset() {

    }
}
