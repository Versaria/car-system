# Car System Project 🚗

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![JUnit](https://img.shields.io/badge/JUnit-4-red)
![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)

Проект Car System предоставляет функционал для:
- Предупреждений о превышении скорости
- Расчета штрафов за превышение скорости
- Обработки сигналов светофора

## 🚀 Быстрый старт
### Требования
- Java JDK 11+ (рекомендуется Zulu для Mac M1)
- Apache Maven 3.6+
- Git (для клонирования)

### Установка и запуск
```bash
git clone https://github.com/Versaria/car-system.git
cd car-system
mvn clean package
java -cp target/car-system-1.0-SNAPSHOT.jar com.example.carsystem.Main
```

## 📂 Структура проекта
```
car-system/
├── src/
│   ├── main/
│   │   └── java/com/example/carsystem/
│   │       ├── CarSystem.java  # Основная логика
│   │       └── Main.java       # Демонстрация
│   └── test/
│       └── java/com/example/carsystem/
│           └── CarSystemTest.java # Тесты
├── pom.xml                    # Конфигурация Maven
└── README.md
```

## 📋 Функционал
### Основные методы:
- `printSpeedingWarning()` - предупреждение о превышении скорости
```java
carSystem.printSpeedingWarning(40, 65);
// Вывод: "Вы превысили скорость. Может прийти штраф"
```

- `printSpeedingTicket()` - расчет штрафа
```java
carSystem.printSpeedingTicket(40, 85);
// Вывод: "Может прийти штраф: 2500 рублей!"
```

- `processTrafficLightSignal()` - обработка светофора
```java
String result = carSystem.processTrafficLightSignal("зелёный");
// Возвращает: "можно ехать"
```

## 📊 Покрытие тестами
Проект включает unit-тесты для всех основных методов:
- Тестирование расчета штрафов
- Проверка обработки сигналов светофора
- Граничные случаи

Запуск тестов:
```bash
mvn test
```

## 💻 Пример работы
```java
public static void main(String[] args) {
    CarSystem carSystem = new CarSystem();
    
    // Проверка превышения скорости
    carSystem.printSpeedingWarning(60, 85);
    carSystem.printSpeedingTicket(60, 85);
    
    // Обработка светофора
    System.out.println(carSystem.processTrafficLightSignal("жёлтый"));
}
```

Вывод:
```
Вы превысили скорость. Может прийти штраф
Может прийти штраф: 500 рублей!
стой
```

## 📜 Лицензия
Проект распространяется под лицензией [MIT](LICENSE).

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/improvement`)
3. Сделайте коммит (`git commit -am 'Add new test cases'`)
4. Запушьте ветку (`git push origin feature/improvement`)
5. Откройте Pull Request

---

<details>
<summary>🔧 Дополнительные команды</summary>

```bash
# Запуск конкретного тестового класса
mvn test -Dtest=ProgramTest

# Сборка с подробным отчетом
mvn surefire-report:report
```
</details>
