# CCRM-Java
# Campus Course & Records Manager (CCRM)

A **console-based Java application** for managing students, courses, enrollments, and academic records in a campus setting.  
This project demonstrates **Object-Oriented Programming (OOP)** concepts, Java SE APIs, modern I/O with NIO.2, Streams, Date/Time API, recursion, and design patterns (Singleton, Builder).

---

## ✨ Features
- **Student Management**: Add, update, deactivate, list students.  
- **Course Management**: Add, update, deactivate, list courses, search & filter with Streams.  
- **Enrollment & Grading**: Enroll students, record marks, compute GPA, and generate transcripts.  
- **File Utilities**: Import/export data via CSV-like files, backup with NIO.2, recursive size calculator.  
- **Reports**: GPA distribution, top students, and more.  
- **Menu-driven CLI**: Simple console workflow for all operations.  

---

## 🏗 Project Structure
```
edu.ccrm
 ├─ cli/        → Menu, input loop, Main entry point
 ├─ domain/     → Student, Instructor, Course, Enrollment, Semester, Grade
 ├─ service/    → StudentService, CourseService, EnrollmentService
 ├─ io/         → Import/Export utilities, BackupService
 ├─ util/       → Validators, Comparators, recursion utilities
 └─ config/     → AppConfig (Singleton), Builders
```

---

## ⚙️ Requirements
- Java SE 11+ (tested with Java 17)  
- Any IDE (Eclipse, IntelliJ, or VS Code) OR command-line build  

---

## 🚀 Setup & Run

### Compile
```bash
javac -d bin src/edu/ccrm/**/*.java
```

### Run
```bash
java -cp bin edu.ccrm.cli.Main
```

---

## 📂 Example Usage
Sample CLI flow:
```
===== Campus Course & Records Manager =====
1. Manage Students
2. Manage Courses
3. Manage Enrollment & Grades
4. Import/Export Data
5. Backup & Reports
6. Exit
```

---

## 📸 Screenshots (to be added)
- JDK installation verification (`java -version`)  
- Eclipse/IDE project setup  
- Running CLI menu  
- Exported backup folder  

---

## 📝 Documentation
- [USAGE.md](USAGE.md) → Sample commands and test data usage.  
- Evolution of Java (short bullets)  
- Java SE vs EE vs ME comparison  
- JVM, JDK, JRE explanation  
- Notes on assertions  

---

## 📌 Deliverables Checklist
- [x] Source code (`src/`)  
- [x] README.md  
- [x] USAGE.md  
- [ ] Screenshots folder  
- [ ] Optional demo video  

---

## 🙏 Acknowledgements
- Java SE official documentation  
- Oracle tutorials on NIO.2, Streams, and OOP patterns  
