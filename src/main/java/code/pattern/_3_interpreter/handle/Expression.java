package code.pattern._3_interpreter.handle;

import code.pattern._3_interpreter.model.ContentModel;

public class Expression extends ExpressionAbstract {
    
    @Override
    public void interperter(ContentModel contentModel) {
        StringBuilder stringBuilder = new StringBuilder();
        if (contentModel.getTitle() != null) {
            stringBuilder.append("�����ǣ�" + contentModel.getTitle());
        }
        if (contentModel.getHead() != null) {
            stringBuilder.append("ҳü�ǣ�" + contentModel.getHead());
        }
        if (contentModel.getText() != null) {
            stringBuilder.append("�����ǣ�" + contentModel.getText());
        }
        if (contentModel.getFoot() != null) {
            stringBuilder.append("ҳ���ǣ�" + contentModel.getFoot());
        }
        System.out.println(stringBuilder.toString());
    }
}
