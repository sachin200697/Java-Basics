To create a Java module project in NetBeans:

1. Step first creating project:
--------------------------------
File -> New Project -> Java with Ant -> Java Modular Project (Give project 
any name, for example : JavaModularApplication1)

2. Creating Modules:
---------------------
Right click on Project Name: JavaModularApplication1 -> New -> Module -> Give any name: moduleA

We can create many modules with the same process. To create another module with name moduleB

Right click on Project Name: JavaModularApplication1 -> New -> Module -> Give any name: moduleB


3. Creating Package:
---------------------
Right Click on module name (moduleA) -> New -> Java Package -> Give any name: package1

Second package: 
Right Click on module name (moduleA) -> New -> Java Package -> Give any name: package2

Package in moduleB:
Right Click on module name (moduleB) -> New -> Java Package -> Give any name: packageB1


4. Creating classes:
---------------------
Right Click on Package Name : package1 -> New -> Java class -> Give any name: Class1

Class inside second package(package2):
Right Click on Package Name : package2 -> New -> Java class -> Give any name: Class2

5. Creating Main Class: It will be considered as the starting poing to run the application.
--------------------------------------------------------------------------------------------
If we create normal class and run it as main class then we get class not found problem. So to 
resolve it we need to create a main java class insted of java class.

Right Click on Package Name : packageB1 -> New -> Java Main Class -> Give any name 
OR

Right Click on Package Name : packageB1 -> New -> others -> Java Main Class -> give any name

6. To see the structure of project:
-----------------------------------
Click on Files tab (near to the Project)

7. Running with commandline:
---------------------------------
javac -d output_filder/helloworld src/helloworld/com/bethan/greetings/HelloWorld.java src/helloworld/module-info.java

java --module-path output --module helloworld/com.bethan.helloworld.HelloWorld
OR 
java -p output -m helloworld/com.bethan.helloworld.HelloWorld


