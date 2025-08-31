javac -d ./out module-info.java ExampleMain.java
jar --create --file module-example.jar -C ./out .
java --module-path ./module-example.jar --module module.example/example.ExampleMain

bash
javac -d ./out module-info.java ExampleMain.java

bash
jar --create --file module-example.jar -C ./out .

bash
java --module-path ./module-example.jar --module module.example/example.ExampleMain


Welcome to the Java Platform Module System!

