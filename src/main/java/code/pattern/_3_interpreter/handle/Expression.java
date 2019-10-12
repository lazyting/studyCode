package code.pattern._3_interpreter.handle;

import code.pattern._3_interpreter.model.ContentModel;

public class Expression extends ExpressionAbstract {
    
    @Override
    public void interperter(ContentModel contentModel) {
        StringBuilder stringBuilder = new StringBuilder();
        if (contentModel.getTitle() != null) {
            stringBuilder.append("标题是：" + contentModel.getTitle());
        }
        if (contentModel.getHead() != null) {
            stringBuilder.append("页眉是：" + contentModel.getHead());
        }
        if (contentModel.getText() != null) {
            stringBuilder.append("正文是：" + contentModel.getText());
        }
        if (contentModel.getFoot() != null) {
            stringBuilder.append("页脚是：" + contentModel.getFoot());
        }
        System.out.println(stringBuilder.toString());
    }
}
