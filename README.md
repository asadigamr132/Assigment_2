# Logistics Application — Factory Method & Abstract Factory

## Project Overview

A Java console application demonstrating two creational design patterns:

* **Factory Method** — creates `Truck` or `Ship`.
* **Abstract Factory** — creates matching `Button` and `Checkbox` for Windows or macOS.

The user selects a delivery mode and a UI platform. All four combinations are supported.

## Technologies

* Java 17
* IntelliJ IDEA

## Project Structure

```text
src/
└── main/
    └── java/
        └── logistics/
            ├── Main.java
            ├── factorymethod/
            ├── abstractfactory/
            └── application/

## How to Run

1. Open the project in IntelliJ IDEA.
2. Set the project SDK to **JDK 17**.
3. Run `Main.java`.
4. Enter the delivery mode and UI platform.

## Supported Input

**Delivery mode:**

```text
ROAD
SEA
```

**UI platform:**

```text
WINDOWS
MACOS
```

Input is case-insensitive.

Invalid or empty input displays an error message and stops the program.

## Sample Run

```text
Enter delivery mode (ROAD/SEA): ROAD
Enter UI platform (WINDOWS/MACOS): WINDOWS

Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse
```


## Author

Abdraissov Altair
SE-2528
