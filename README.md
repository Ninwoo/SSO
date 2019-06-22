# SSO 登陆系统实践

从最基本的登陆系统入手，逐渐扩展，最终实现单点登陆系统。

其中主要探索一下几方面内容：

* Session Vs Cookie
* Session同步存在的问题和难点
* 常用加密解密工具
* 复习Spring MVC相关知识点

## 基础登陆版本

创建如下项目：

* sso-parent
  * sso-web
  * sso-service
  * sso-common

sso-web对应controller层，sso-service对应service层。在这个演示系统中，并未引入dao层。dao层逻辑采用一个HashMap进行简单模拟，暂时未涉及到更新用户信息，所以并未采用线程安全的Map。

* sso-web主要提供了一个login.jsp和一个index.jsp,index.jsp是要访问的目标jsp，在Spring MVC中添加了拦截器，如果没有查找到指定的Session信息，页面会被拦截并自动跳转到login.jsp。
* 登陆成功后，将在Session中添加user参数，
* 再次访问index.jsp拦截器检查到Session中的user参数将放行。