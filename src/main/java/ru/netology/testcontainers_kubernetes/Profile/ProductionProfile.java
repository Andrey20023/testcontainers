package ru.netology.testcontainers_kubernetes.Profile;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import ru.netology.testcontainers_kubernetes.congig.JavaConfig;

@ConditionalOnBean(JavaConfig.class)
public class ProductionProfile implements SystemProfile {

    public ProductionProfile() {
        super();
    }

    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}