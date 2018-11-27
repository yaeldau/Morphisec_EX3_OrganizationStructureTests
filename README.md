# Morphisec_EX3_OrganizationStructureTests

Assignment 3
Attached a system for A Hi-Tech Company that deals with organization structure.
The system is implemented in java.
System Specification:
- The company structure consist of 2 types of persons:
o Employee
o Manager
- Employee and Manager has the following attributes:
o Id
o First Name.
o Last Name.
o Salary
- Manager may have number of Employees and managers reporting to him.
- Manager can assign tasks to its direct Employees (only Employees performing Tasks).
o Task has four attributes: tasks text, assign date, due date and is finished.
- Employee can finish all of his tasks.
- We define one special action: defineEmployeesSalary
o This action gets the list of all managers and employees in the organization.
o When executing it - all employees and managers in the organization gets their
salary.
o Side Effect: printing to console the names with the salaries defined.
- The salary is defined according to the following:
o For each finished task in the employee list the employee get 100$
o For each direct employee the manager gets 120$ per finished task of his employees
o For each manager subordinate his manager gets 1000$ for managing
Your assignment is to implement tests for the system that give us good coverage for the
requirements (use for example unit tests, integration tests etc…)
