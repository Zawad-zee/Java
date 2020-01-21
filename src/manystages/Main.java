/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manystages;

import content.StageFour;
import javafx.application.Application;
import javafx.stage.Stage;

// it creates four stages
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //stage one
        primaryStage.setTitle("Primary Stage");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.setY(100);
        primaryStage.setX(50);
        primaryStage.show();
        
        //Stage stagetwo; what it does is it holds a memory location
        //declaring two stages from the start method by creating an object of Stage
        Stage stageTwo = new Stage();
        stageTwo.setTitle("Stage Two");
        stageTwo.setWidth(300);
        stageTwo.setHeight(300);
        stageTwo.setX(350);
        stageTwo.setY(100);
        stageTwo.show();
        
        //by creating the object of StageThree is sets the default values through the constructor 
        //to the parameters of the inner class.
        StageThree Three = new StageThree();
        Three.show();
        
        //fourth stage is created by an external class stagefour.java which has been imported in this file
        StageFour Four = new StageFour();
        Four.show();
        
        
        //whichever stage show method is called at the last will have the focus
    }
    public class StageThree extends Stage{
        public StageThree(){
            setTitle("Stage Three");
            setWidth(300);
            setHeight(300);
            setY(100);
            setX(650);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
