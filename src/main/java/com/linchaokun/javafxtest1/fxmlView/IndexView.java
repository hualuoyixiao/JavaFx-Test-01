package com.linchaokun.javafxtest1.fxmlView;

import com.jfoenix.controls.JFXDecorator;
import com.linchaokun.javafxtest1.utils.JavaFxViewUtil;
import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import de.felixroske.jfxsupport.GUIState;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.context.annotation.Scope;

import java.util.Optional;
import java.util.ResourceBundle;

/** 
 * @ClassName: IndexView
 * @Description: 
 * @author: xufeng
 * @date: 2017/11/22 17:38  
 */
@FXMLView(value = "/fxmlView/index.fxml")
public class IndexView extends AbstractFxmlView {
    public IndexView() throws Exception {
        GUIState.getStage().setTitle("JavaFx测试1");//修改标题国际化
    }

    @Override
    public Parent getView() {
        JFXDecorator decorator = JavaFxViewUtil.getJFXDecorator(GUIState.getStage(),GUIState.getStage().getTitle(),"/images/icon.jpg",super.getView());
        decorator.setOnCloseButtonAction(()->{System.exit(0);});
        return decorator;
    }
}
