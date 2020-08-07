# XUnit
自动化

打开浏览器调试：
  chrome -remote-debugging-port=9222
  
//java
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
driver = new ChromeDriver(options);
