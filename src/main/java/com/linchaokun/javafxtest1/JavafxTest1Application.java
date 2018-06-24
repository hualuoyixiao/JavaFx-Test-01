package com.linchaokun.javafxtest1;

import com.linchaokun.javafxtest1.fxmlView.IndexView;
import com.linchaokun.javafxtest1.utils.JavaFxViewUtil;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import de.felixroske.jfxsupport.GUIState;
import de.felixroske.jfxsupport.SplashScreen;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavafxTest1Application extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        SplashScreen splashScreen = new SplashScreen(){
            @Override
            public String getImagePath() {
                return "/images/javafx.png";
            }
        };
        launch(JavafxTest1Application.class,IndexView.class,splashScreen,args);
    }

    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        super.beforeInitialView(stage, ctx);

        Scene scene = JavaFxViewUtil.getJFXDecoratorScene(stage,"",null,new AnchorPane());
        stage.setScene(scene);
        GUIState.setScene(scene);
    }
}
