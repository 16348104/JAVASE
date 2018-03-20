package NCR.jbcz.L9_13;


import javax.swing.*;

/**
 * Created by zb on 2018/3/20.
 */
public class JOptionPaneDemo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "消息类型是：information message", "第一条消息", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "消息类型是：Error message", "第二条消息", JOptionPane.ERROR_MESSAGE   );
        JOptionPane.showMessageDialog(null, "消息类型是：Warning message", "第三条消息", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "消息类型是：Question message", "第四条消息", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "消息类型是：Plain message", "第五条消息", JOptionPane.PLAIN_MESSAGE);
        String name = JOptionPane.showInputDialog("请输入你的名字", "刘德华");
        JOptionPane.showConfirmDialog(null, "你真是" + name + "?", "确认", JOptionPane.DEFAULT_OPTION);
        JOptionPane.showConfirmDialog(null, "难道你不是张学友？" , "再次确认名字", JOptionPane.YES_OPTION);
        JOptionPane.showConfirmDialog(null, "难道你真不是黎明？" , "第三次确认名字", JOptionPane.YES_NO_CANCEL_OPTION);
    }
}