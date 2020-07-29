package Task_8;

import Task_8.ConfigProperty;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static jdk.internal.org.objectweb.asm.Type.getType;

public class TestAnnotationAnalyzer {
    public void analyz(Class<?> clazz) throws Exception {
        Field[] fields = clazz.getFields();


        for (Field field : fields) {
            if (field.isAnnotationPresent(ConfigProperty.class)) {
                // Получаем доступ к атрибутам
                ConfigProperty configProperty = field.getAnnotation(ConfigProperty.class);
                String expected = configProperty.propertyName();

            }
        }
    }
}
