# Проект для демонстрации инструмента JDepend для измерения качества архитектуры кода
https://github.com/clarkware/jdepend/tree/master

javac -d ./out/ Main.java
javac -d ./out2/ Main.java

java jdepend.swingui.JDepend $pwd\out
