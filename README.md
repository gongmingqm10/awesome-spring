# RESTful API & Spring MVC
ThoughtWorks武汉办公室郑大晔校@2015，课程《RESTful API & Spring MVC》

##课程目标
1. 了解RESTful API 的概念及其优点
2. 了解RESTful API 使用方法
3. 理解Spring MVC概念及原理
4. 学会搭建一个Spring框架的网站

##课程安排
课程已实践结合讲解的形式进行。需要学生课下完成作业，需要学生进行课前预习。课堂使用各种例子帮助学生理解及实践。课后需要预留课程相关的家庭作业。

实例场景：漂流阅读，主要数据库关系为：用户，图书。主要功能为，用户以及图书的增删查改。

###课前准备

1. 环境Setup：Mysql 5.5.3+, [Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en-US), Intellij
2. 预习：了解RESTful API以及Spring MVC基础概念，参考 [理解Restful架构](http://www.ruanyifeng.com/blog/2011/09/restful.html), [REST API tutorial](http://www.restapitutorial.com/lessons/whatisrest.html), [Spring MVC]( http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html)

3. 运行你的工程:

Clone工程：`git clone https://github.com/gongmingqm10/awesome-spring/`

进入到 `awesome-spring`目录，运行命令 `./gradlew build`, `./gradlew setupDB`, `./gradlew jettyRun`。

访问 `http://localhost:8888/awesome-spring`, 可以看到 `欢迎来到阅读世界`。说明你的环境setup完成！

###课堂讲解
1. 讲解：RESTful 设计理念，如何设计API。状态，资源 (20min)
3. 实战：创建用户、修改用户、删除用户API。POSTMAN演示 (20min)
4. Showcase + 讲解 (迅速Checkout到做好的版本) (10min)

5. 讲解：MVC.分层的概念，好处。Spring MVC如何做到的呢。(15min)
6. 演练：在Web页面显示所有用户，用户创建 (15min)
7. 实战：点击用户查看用户图书，给用户添加图书 (30min)
8. Showcase (10min)

9. Spring MVC 测试应该怎么写, 前端MVC + RESTful API；(10min)

10. 作业: 完成REST API： users/:id/books, users/:id/books/:id, users/:id/books [POST]。完成Web中，删除某个用户图书，更新用户图书信息

## How to Debug in Intellij

1. Run your project in command line with `./gradlew jettyRunDebug`
2. Open your project with Intellij, open "Run -> Edit configurations", click "+" on the top, Select "Remote" from the list. Click "OK" finally.
3. Debug your project with the debugger you just added. Normally it's called "Unnamed".
4. Visit the URL and add breakpoints in Intellij project, you'll find the debug mode works.