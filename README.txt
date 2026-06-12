# QuickChat Messaging System (Java POE Project)

Project Overview
QuickChat is a simple Java-based console messaging system developed as part of a POE (Practical Assignment).  
It allows users to log in, send messages, and manage messages using a menu-driven interface.

The system demonstrates Object-Oriented Programming (OOP) principles such as:
- Encapsulation
- Classes and Objects
- Methods
- Data validation
- ArrayList usage

---

 Features

  Login System
- Username validation (must contain "_" and be ≤ 5 characters)
- Password validation (must contain capital letter, number, and be at least 6 characters)
- Login verification before accessing the system

 Messaging System
- Send messages with a unique ID
- Enforce message length limit (250 characters)
- Store messages using ArrayList
- View all sent messages
- Search messages by ID
- Delete messages by ID

Extra Feature
- Tracks total number of messages sent using a static counter



 Project Structure


 OOP Concepts Used

1. Encapsulation
All variables in classes are private and accessed through methods.

2. Classes and Objects
Each feature is separated into its own class:
- Login
- Message
- Main controller

 3. Methods
Each function is handled by dedicated methods such as:
- checkUserName()
- checkPassword()
- sendMessage()
- searchMessage()

 4. Static Variables
Used to track total number of messages sent.



 Testing (JUnit)

The project includes unit tests for:

 LoginTest
- Valid username
- Invalid username
- Valid password
- Invalid password
- Login success and failure
- Edge cases (empty input, weak password)

 MessageTest
- Message length validation
- Message creation verification
- Edge cases for invalid messages



 How to Run the Program

1. Open project in IntelliJ / NetBeans / Eclipse
2. Ensure all `.java` files are in the same package
3. Compile all files
4. Run `Main.java`
5. Follow on-screen instructions

---

 Menu Options

When running the program, the user can:

1. Send Message
2. View Messages
3. Search Message by ID
4. Delete Message by ID
5. Show Total Messages Sent
6. Exit



 Validation Rules

 Username
- Must contain an underscore (_)
- Must be 5 characters or less

 Password
- At least 6 characters
- Must contain at least 1 uppercase letter
- Must contain at least 1 number

 Message
- Must not exceed 250 characters



 Learning Outcomes

This project demonstrates:
- Basic Java programming skills
- Object-Oriented Programming principles
- Input validation techniques
- ArrayList data storage
- Unit testing with JUnit
- Menu-driven console application design

RONEWA RAMPHABANA

