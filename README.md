# solution_midterm
# в task1 я реализовал умнный дом исрользуя паттерны: Composite, Decorator, Abstract Factory, Facade, Adapter
1. Composite

 -> Класс Room управляет несколькими объектами SmartDevice (например, Light, Thermostat).

2. Декоратор (Decorator)

->  LoggingDecorator добавляет логирование при включении и выключении устройства.

3. Абстрактная фабрика (Abstract Factory)

-> BasicSmartHomeFactory создает экземпляры Light и Thermostat.

4. Фасад (Facade)

-> SmartHomeController предоставляет методы turnAllOn(), turnAllOff(), getStatusReport().

5. Адаптер (Adapter)

-> LockAdapter адаптирует старую систему замков (OldLockSystem) к интерфейсу LegacyLockSystem.






# в task 2 я реализовал консольное приложение для обработки платежей с поддержкой различных методов оплаты

  использовал два паттерна
  
    ->Factory Method для создания объектов различных способов оплаты
    ->Adapter для интеграции с внешними или сторонними сервисами
 
  Дополнительные функции

 Поддержка статусов транзакций (успех/ошибка)




#  в task3 я реализовал Симмулятор коффе шопа с использованеим двух паттерна 

    -> Factory Method для создания различных видов кофе
    -> Decorator Pattern для динамического добавления ингредиентов


 
 Хранение и просмотр истории транзакций
 
 Обработка ошибок (некорректные данные, неизвестный метод оплаты)
