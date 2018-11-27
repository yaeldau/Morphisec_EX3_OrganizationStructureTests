# Morphisec_EX3_OrganizationStructureTests

Assignment 3

Attached a system for A Hi-Tech Company that deals with organization structure.

The system is implemented in java.

System Specification:

- The company structure consist of 2 types of persons:

  - Employee
  - Manager
  
- Employee and Manager has the following attributes:
  - Id
  - First Name.
  - Last Name.
  - Salary
  
- Manager may have number of Employees and managers reporting to him.

- Manager can assign tasks to its direct Employees (only Employees performing Tasks).

  - Task has four attributes: tasks text, assign date, due date and is finished.
  
- Employee can finish all of his tasks.

- We define one special action: defineEmployeesSalary

  - This action gets the list of all managers and employees in the organization.
  - When executing it - all employees and managers in the organization gets their
salary.

  - Side Effect: printing to console the names with the salaries defined.
- The salary is defined according to the following:
  - For each finished task in the employee list the employee get 100$
  - For each direct employee the manager gets 120$ per finished task of his employees
  - For each manager subordinate his manager gets 1000$ for managing
  
Your assignment is to implement tests for the system that give us good coverage for the
requirements (use for example unit tests, integration tests etc…)
