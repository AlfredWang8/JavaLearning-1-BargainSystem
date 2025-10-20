# JavaLearning-1-BargainSystem
## 2025.10.20
### 功能
我的第一个JAVA代码小练手，完成了一个具有以下功能的记账系统：
- 添加和删除收入或支出记录。
- 查看所有记录。
- 将记录存储到records.txt中。
### 结构
`AccountBook/
 ├─ src/
 │   ├─ Main.java              # 程序入口
 │   ├─ model/
 │   │    └─ Record.java       # 定义账目类
 │   ├─ service/
 │   │    └─ AccountService.java # 管理账目逻辑
 │   ├─ util/
 │   │    └─ FileUtil.java     # 文件读写工具类
 │   └─ view/
 │        └─ Menu.java         # 菜单界面
 └─ data/
      └─ records.txt           # 存储账目信息
`
### 运行
运行Main.java即可。
