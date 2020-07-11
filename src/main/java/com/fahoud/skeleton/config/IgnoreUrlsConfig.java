package com.fahoud.skeleton.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Fahoud
 * Date: 2020/7/11
 * Time: 11:13
 * Description:用于配置不需要保护的资源路径
 */
@Data
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {
    /**
     * 白名单路径
     */
    private List<String> urls = new ArrayList<>();
}
