package mybatis;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.util.StringUtils;

public class SlaveBeanNameGenerator implements BeanNameGenerator {
    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        String fullClassName = definition.getBeanClassName();
        String simpleClassName = StringUtils.unqualify(fullClassName);
        return StringUtils.uncapitalize(simpleClassName) + "Slave";
    }
}
