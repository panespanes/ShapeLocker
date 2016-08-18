# ShapeLocker
PATTERN LOCK, unlock with gestures<br>
(手势解锁,九宫格解锁,图形解锁)<br><br>
![image](https://github.com/panespanes/ShapeLocker/blob/master/shapelocker2.png)
<br>
<br>
<br>

Download
--------
You can download binaries from GitHub's [release page](https://github.com/panespanes/ShapeLocker/releases)

Or use Gradle:  
Step 1. Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
Step 2. Add the dependency
```gradle
	dependencies {
	        compile 'com.github.panespanes:ShapeLocker:v1.0.3'
	}
```

<br>
How to Use
-------------------

Simple use case: 

in layout.xml: 
```java
// To create a simple view:
    <com.panes.shapelocker.view.ShapeLocker
        android:id="@+id/sl"
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@android:color/darker_gray"
        >

    </com.panes.shapelocker.view.ShapeLocker>
 ```
More configurations:
 ```java

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp);
        
        // load a default theme:
        ShapeLockerProperties.with(this).loadLightTheme();
        // or:
        ShapeLocker sl = (ShapeLocker) findViewById(R.id.sl);
        sl.loadLightTheme();
        
        
    }
```

<br>
UNSOLVED:
-------------------

 模拟器上运行的bug (真机上运行没影响)<br>
 有同学反映<strong><em>模拟器上运行</strong></em>会出现"密码圈绘制不全"的bug, 如图<br>
 
 ![image](https://github.com/panespanes/ShapeLocker/blob/master/mdp.png)
 <br>
 做了些实验, 真机不会出现这个bug, AVD自带模拟器没有重现, BlueStacks模拟器没有类似情况,<br> 而"靠谱助手","海马玩","逍遥模拟器"等VirtualBox底层的模拟器均重现bug.<br>
 猜测是由于VirtualBox的驱动对于安卓UI图形绘制的支持并不全面导致的:<br>
 具体原因ShapeLocker对界面刷新做了优化, 响应触摸事件后<strong><em>只重绘被影响区域</em></strong>,<br> 
 相关代码:   
 ```java  

 Rect invalidateRect = new Rect();
 ...
 invalidateRect.set((int) (left - radius), (int) (top - radius), (int) (right + radius), (int) (bottom + radius));
 ...
 invalidateRect.union((int) (left - radius), (int) (top - radius), (int) (right + radius), (int) (bottom + radius));
 ...
 invalidateRect.set((int) (left - widthOffset), (int) (top - heightOffset), (int) (right + widthOffset), (int) (bottom + heightOffset));
 ...
 invalidate(invalidateRect);

```
 而VirtualBox并不会按照严格按照rect大小重绘区域.<br>
 解决办法(真机运行的项目中请不要这样修改, 因为会造成平均34%左右性能损失):<br>
 将这部分代码改为
 ```java
invalidate();
 ```
 即可.
