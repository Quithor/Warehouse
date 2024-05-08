# <center>  Warehouse 库存管理系统  </center>

---

# 目录

- [项目简介](#项目简介)
- [动机和目标](#动机和目标)
- [怎么使用这个项目](#怎么使用这个项目)
    - [如何开始](#如何开始)
    - [贡献](#贡献)
- [其他](#其他)
    - [许可证](#许可证-)
    - [路线图](#路线图-)
- [项目文档](#项目文档)

# 项目简介

这是我为我想象中的商店的仓库编写的一个库存管理软件  
<font color="#999">~~但是写着写着就成了网店的全套系统了~~🤣</font>

# 动机和目标

我试图在这个项目中实践一下软件工程中的完整生命周期

# 怎么使用这个项目

## 如何开始
  - 安装  
  说明如何安装项目依赖项或将其部署到环境中。
  - 配置
    确认你的电脑有**Java 17**或以上的环境
    使用文档编辑器写入端口范围是$[0,65565]$
  - 运行
    - 服务器端  
    先将获取项目的jar包[^soft]，在文件存放的目录打开命令行输入
    ```Bash
    java -jar [filename].jar
    ```
    这里的filename是jar的文件名称
    - 客户端  
    直接在浏览器中输入服务器的路径或部署域名即可访问，如果是同一设备则输入localhost:(port)即可访问
    
## 贡献
- 代码风格  
  说明项目的代码风格或使用的代码规范。
- 贡献流程  
  解释如何为项目做贡献，包括提交PR的流程。
- 联系信息  
  如果您对这个项目有兴趣，可以自行获取并修改

# 其他

##  许可证 

本项目遵循MIT开源协议

## 路线图 

或许会推出C/C++版本(画饼ing)

## 项目文档

* [用户需求](documentation/User%20Requirements%20Specification.md)
* [软件规格需求](documentation/Software%20Requirements%20Specification.md)
* [设计概要](documentation/Software%20Design%20Brief.md)
* [后端设计](documentation/Backend%20design%20specifications.md)
* [前端设计](documentation/Frontend%20design%20specifications.md)

[^soft]: 这个jar应该是这个项目的本体可执行文件，在任意操作系统均可直接运行，仅需要有Java环境