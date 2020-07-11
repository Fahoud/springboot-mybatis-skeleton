package com.fahoud.skeleton.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Fahoud
 * Date: 2020/7/11
 * Time: 10:37
 * Description:
 */
public class Generator {
    public static void main(String[] args)throws Exception
    {
//        MBG执行过程中的警告信息
        List<String> warnings = new ArrayList<>();
//        当生成的代码重复时，覆盖源代码
        boolean overWrite = true;
//        读取我们的MBG配置文件
        InputStream inputStream = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = configurationParser.parseConfiguration(inputStream);
        inputStream.close();

        DefaultShellCallback callback = new DefaultShellCallback(overWrite);
        //创建MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration,callback,warnings);
        //执行生成代码
        myBatisGenerator.generate(null);
        //输出警告信息
        for (String warning:warnings)
        {
            System.out.println(warning);
        }
    }
}
