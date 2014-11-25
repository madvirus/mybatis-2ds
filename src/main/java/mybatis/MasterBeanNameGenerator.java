package mybatis;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.util.StringUtils;

public class MasterBeanNameGenerator implements BeanNameGenerator {
    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        String fullClassName = definition.getBeanClassName();
        String simpleClassName = StringUtils.unqualify(fullClassName);
        return StringUtils.uncapitalize(simpleClassName) + "Master";
    }
}
