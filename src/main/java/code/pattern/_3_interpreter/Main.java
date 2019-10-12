package code.pattern._3_interpreter;

import code.pattern._3_interpreter.handle.Expression;
import code.pattern._3_interpreter.model.ContentModel;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        ContentModel contentModel = new ContentModel();
        contentModel.setHead("ҳü");
        contentModel.setTitle("����");
        contentModel.setText("����");
        contentModel.setFoot("ҳ��");
        expression.interperter(contentModel);
    }
}
