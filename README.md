# Workshop 6 – Java Collections / OOP Concepts

一个可以直接打开就跑的 Java 项目。10 个源文件都在 `src` 里，已经在 Java 26 下编译通过，运行结果见 `run_output.txt`。

## 结构

```
Workshop6/
├─ src/
│  ├─ RunAll.java           一次跑完 7 道题（推荐入口）
│  ├─ Exercise1.java        1 歌曲 + 歌手数组
│  ├─ Exercise2.java        2 冒泡排序
│  ├─ Exercise3.java        3 单词字母反转
│  ├─ Exercise4.java        4 解码 "G tgsl Qefe."
│  ├─ Exercise5.java        5 段落搜索
│  ├─ IdentifyMyParts.java  6 题目给定的类
│  ├─ Exercise6.java        6 跑题目里那段代码
│  ├─ Boxes.java            7 画方框的类
│  └─ Driver.java           7 驱动类（main）
├─ out/                     编译产物
├─ run.bat                  双击就编译 + 跑全部
├─ run_output.txt           7 题的真实运行结果
└─ Workshop 6 - Java Collections - OOP Concepts.docx   原始题目
```

## 怎么用（IntelliJ IDEA）

1. `File` → `Open`，选中 **Workshop6 这个文件夹**（不是选中某个 .java 文件），点 OK。
2. 左侧会出现 `src` 目录；如果它是灰色/橙色，右键 `src` → `Mark Directory as` → `Sources Root`。
3. 打开 `src/RunAll.java`，点左边绿色三角 Run，一次跑完 7 道题。
4. 要单独截图某题，就打开对应 `ExerciseN.java` 点 Run（Exercise 7 跑 `Driver.java`）。

Eclipse：`File` → `New` → `Java Project`，取消 "use default location"，Location 选 Workshop6 文件夹，Finish。

不想用 IDE、只要有 JDK：双击 `run.bat` 即可。

命令行手动跑：

```
javac -encoding UTF-8 -d out src\*.java
java -cp out RunAll
java -cp out Driver
```

---

## Exercise 6 文字答案（可直接抄进 Word）

**a) Class variables（类变量）**

`public static int x = 7;` —— 只有 `x`。带 `static`，属于 `IdentifyMyParts` 这个类本身，整个程序只有一份，所有对象共享。

**b) Instance variables（实例变量）**

`public int y = 3;` —— 只有 `y`。没有 `static`，每 `new` 一个对象就有独立的一份。

**c) 输出**

```
a.y = 5
b.y = 6
a.x = 2
b.x = 2
IdentifyMyParts.x = 2
```

`a.y = 5`、`b.y = 6` 各改各的，所以互不影响；而 `x` 只有一份，`a.x = 1` 改成 1 之后 `b.x = 2` 又把它改成 2，所以 a.x、b.x、IdentifyMyParts.x 都是 2。

---

## Exercise 4 说明

题目文档里那张字母对照表实际没有印出来（正文只有 `a` → `c`、`b` → `r` 两个例子），
所以 `CODE_CHARS / PLAIN_CHARS` 两个数组里先填了这条密文实际用到的字母对，运行结果是：

```
Coded message:   G tgsl Qefe.
Decoded message: I love Java.
```

如果老师另外给了完整 26 个字母的表，把剩下的字母对补进这两个数组即可，程序逻辑不用动。
注意这张表区分大小写：`G` → `I` 和 `g` → `o` 是两条不同的记录，要分别写。
