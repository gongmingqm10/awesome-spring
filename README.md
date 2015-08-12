# RESTful API & Spring MVC
ThoughtWorks武汉办公室郑大晔校@2015，课程《RESTful API & Spring MVC》

##Homework

####RESTful API (主要在BooksApi中返回Json数据即可)
1. 获取指定用户的所有图书
2. 为指定用户创建图书

####Spring Web Page (主要在BookController中实现相关逻辑)
1. 用户列表中点击用户，查看用户所拥有的图书。此时浏览器也许会跳转为 `/users/:id/books`。此时页面中展现用户图书列表
2. 在1中的用户图书列表页面，点击“添加”按钮，此时浏览器跳转为新建图书页面`/users/:id/books/new`。用户通过表单创建用户(POST, /users/:id/books/)。

上述URL仅供参考

##Objectives
1. 了解RESTful API 的概念及其优点
2. 了解RESTful API 使用方法
3. 理解Spring MVC概念及原理
4. 学会搭建一个Spring框架的网站

###Prepare

1. 环境Setup：Mysql 5.5.3+, [Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en-US), Intellij
2. 预习：了解RESTful API以及Spring MVC基础概念，参考 [理解Restful架构](http://www.ruanyifeng.com/blog/2011/09/restful.html), [REST API tutorial](http://www.restapitutorial.com/lessons/whatisrest.html), [Spring MVC]( http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html)
3. 运行你的工程:
Clone工程：`git clone https://github.com/gongmingqm10/awesome-spring/`
进入到 `awesome-spring`目录，运行命令 `./gradlew build`, `./gradlew setupDB`, `./gradlew jettyRun`。
访问 `http://localhost:8888/awesome-spring`, 可以看到 `欢迎来到阅读世界`。说明你的环境setup完成！

## How to Debug in Intellij

1. Run your project in command line with `./gradlew jettyRunDebug`
2. Open your project with Intellij, open "Run -> Edit configurations", click "+" on the top, Select "Remote" from the list. Click "OK" finally.
3. Debug your project with the debugger you just added. Normally it's called "Unnamed".
4. Visit the URL and add breakpoints in Intellij project, you'll find the debug mode works.