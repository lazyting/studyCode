package code.pattern._3_interpreter;

import code.pattern._3_interpreter.handle.Expression;
import code.pattern._3_interpreter.model.ContentModel;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        ContentModel contentModel = new ContentModel();
        contentModel.setHead("页眉");
        contentModel.setTitle("标题");
        contentModel.setText("正文");
        contentModel.setFoot("页脚");
        expression.interperter(contentModel);
    }
}
