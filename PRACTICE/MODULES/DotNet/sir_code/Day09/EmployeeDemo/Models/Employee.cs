using Humanizer;
using Microsoft.AspNetCore.DataProtection.KeyManagement;
using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.Blazor;

namespace EmployeeDemo.Models
{
    //CREATE TABLE[dbo].[Employees]
    //(
    //    [EmpId] INT           NOT NULL,
    //    [Name] NVARCHAR(50) NULL,
    //    [Basic] DECIMAL(18)  NULL,
    //    [DeptNo]
    //    INT NULL,
    //    PRIMARY KEY CLUSTERED([EmpId] ASC)
    //);
    public class Employee
    {
        public int EmpId { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
    }
}
/* 
2	Anoma	30000	20
3	Hero	55000	20
6	saurabh	50000	10
8	fdvd	33	10
 */