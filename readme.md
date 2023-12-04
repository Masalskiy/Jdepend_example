# Проект для демонстрации инструмента JDepend для измерения качества архитектуры кода

Демонстрационный пример https://youtu.be/MGcrOESA7lc

https://github.com/clarkware/jdepend/tree/master
# Команды для компиляции исходного кода *при необходимости

javac -d ./out/ Main.java

javac -d ./out2/ Main.java

# Запустить Jdepend
java jdepend.swingui.JDepend $pwd\out
