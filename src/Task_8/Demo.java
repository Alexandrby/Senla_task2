package Task_8;

import Task_8.ConfigProperty;
import Task_8.TestAnnotationAnalyzer;

public class Demo {
    public static void main(String [] args) throws Exception {
        TestAnnotationAnalyzer analyzer = new TestAnnotationAnalyzer();
        analyzer.analyz(ConfigProperty.class);
    }
}
