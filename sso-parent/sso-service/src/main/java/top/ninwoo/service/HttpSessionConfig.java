package top.ninwoo.service;

import top.ninwoo.common.pojo.MySessionConfig;

public interface HttpSessionConfig {
    /**
     * 输入SessionConfig,配置到ZK上
     * @param mySessionConfig Session配置类
     */
    void config(MySessionConfig mySessionConfig);

    /**
     * 输入SessionId获取配置类
     * @param sesssionId
     * @return 配置类
     */
    MySessionConfig getSessionConfig(String sesssionId);

    /**
     * 监听session配置变化，如果session变化，使用线程安全的方法进行
     * 配置更新。
     * @param sessionId
     */
    void listenSessionConfigChange(String sessionId);
}
