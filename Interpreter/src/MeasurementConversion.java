import java.lang.reflect.*;
import javax.swing.*;
import javax.swing.text.html.ObjectView;

/**
 * Created by nsp on 2015/10/25.
 */
public class MeasurementConversion {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        String questionAsked = JOptionPane.showInputDialog(frame, "What is your question");

        ConversionContext question = new ConversionContext(questionAsked);

        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();
        double quantity = question.getQuantity();

        try {
            Class tempClass = Class.forName(fromConversion);

            Constructor con = tempClass.getConstructor();

            Object covertFrom = (Expression) con.newInstance();

            Class[] methodParams = new Class[] { Double.TYPE };

            Method coversionMethod = tempClass.getMethod(toConversion, methodParams);

            Object[] params = new Object[] { new Double(quantity) };

            String toQuantity = (String)coversionMethod.invoke(fromConversion, params);

            String answerToQuestion = question.getConversionResponse() + toQuantity + " " + toConversion;

            JOptionPane.showMessageDialog(null, answerToQuestion);

            frame.dispose();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
