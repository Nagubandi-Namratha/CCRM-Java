# CCRM - Campus Course & Records Manager (Scaffold)

This scaffold provides a runnable, minimal console-based Java application demonstrating the required structure and many mandatory features for your project assignment.

## What is included
- Package structure: edu.ccrm.{cli,domain,service,io,util,config}
- Domain classes: Person (abstract), Student, Instructor, Course, Enrollment
- Enums: Semester, Grade
- Services: StudentService, CourseService, EnrollmentService (in-memory implementations)
- AppConfig (Singleton)
- Simple CLI (Main) demonstrating menu-driven operations
- NIO-based export & backup utilities (basic implementations)

## How to use
1. Create a Java project (Java 17+) and copy the `src/` files into `src/` folder preserving package directories.
2. Compile and run `edu.ccrm.cli.Main`.

## Notes
- This scaffold focuses on architecture and sample implementations; expand it to fully meet all project requirements (tests, full CSV parsing, file backups, more robust error handling, etc.).
