using System.Collections.Generic;
using EmployeeDemo.Dao;
using EmployeeDemo.Models;
using Microsoft.AspNetCore.Http.HttpResults;
using Microsoft.AspNetCore.Mvc;
using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.Blazor;
using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages.Manage;

namespace EmployeeDemo.Controllers
{
    public class EmployeesController : Controller
    {
        //CREATE PROCEDURE[dbo].GetEmployees
        //AS

        //    SELECT* FROM Employees;
        //RETURN 0
        // GET: EmployeesController
        public ActionResult Index()
        {
            HttpContext.Session.SetString("Username", "Saurabh");
            List<Employee> emp = EmployeeDao.getAllEmployee();
            TempData["tUsername"] = "T_Saurabh";
            return View(emp);
        }
        //CREATE PROCEDURE[dbo].GetSingleEmployee
        //    @EmpId int
        //AS

        //    SELECT* FROM Employees WHERE EmpId = @EmpId;
        //RETURN 0
        // GET: EmployeesController/Details/5
        public ActionResult Details(int id)
        {
            Employee emp = EmployeeDao.getSingleEmployee(id);
            return View(emp);
        }
        //CREATE PROCEDURE[dbo].InsertEmployee
        //        @EmpId int,
	       // @Name varchar(50),
	       // @Basic decimal (18,2),
	       // @DeptNo int
        //AS

        //    INSERT INTO employees(EmpId, Name, Basic, DeptNo) VALUES(@EmpId, @Name, @Basic, @DeptNo);
        //        RETURN 0
        // GET: EmployeesController/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: EmployeesController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Employee employee, IFormCollection collection)
        {
            try
            {
                EmployeeDao.CreateEmployee(employee);
                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        //CREATE PROCEDURE[dbo].UpdateEmployee
        //    @Name varchar(20),
	       // @Basic decimal (18, 2),
	       // @DeptNo int,
	       // @EmpId int
        //AS

        //    UPDATE Employees SET Name = @Name, Basic = @Basic, DeptNo = @DeptNo WHERE EmpId = @EmpId;
        //        RETURN 0
        // GET: EmployeesController/Edit/5
        public ActionResult Edit(int id)
        {
            Employee emp = EmployeeDao.getSingleEmployee(id);
            return View(emp);
        }

        // POST: EmployeesController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, Employee employee)
        {
            try
            {
                EmployeeDao.UpdateEmployee(id, employee);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        //CREATE PROCEDURE[dbo].DeleteEmployee
        //    @EmpId int
        //AS

        //    DELETE FROM Employees WHERE EmpId = @EmpId;
        //RETURN 0
        // GET: EmployeesController/Delete/5
        public ActionResult Delete(int id)
        {
            Employee emp = EmployeeDao.getSingleEmployee(id);
            return View(emp);
        }

        // POST: EmployeesController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                EmployeeDao.DeleteEmployee(id);
                ViewBag.message = "Employee Deleted";
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
