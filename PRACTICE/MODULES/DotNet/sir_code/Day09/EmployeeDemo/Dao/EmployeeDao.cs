using System;
using System.Data;
using EmployeeDemo.Models;
using Microsoft.Data.SqlClient;
using static System.Net.Mime.MediaTypeNames;
using static System.Runtime.InteropServices.JavaScript.JSType;
namespace EmployeeDemo.Dao
{
    public class EmployeeDao
    {
        public static SqlConnection conn = new SqlConnection("Data Source = (localdb)\\MSSQLLocalDB; Initial Catalog = dac; Integrated Security = True; ");
        
        public static List<Employee> getAllEmployee()
        {
            List<Employee> empList =  new List<Employee>();
            try
            {
                conn.Open();
                SqlCommand cmd = conn.CreateCommand();
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "GetEmployees";
                SqlDataReader dr = cmd.ExecuteReader();
                while (dr.Read())
                {
                    Employee emp = new Employee();
                    emp.EmpId = dr.GetInt32("EmpId");
                    emp.Name = dr.GetString("Name"); ;
                    emp.Basic = dr.GetDecimal("Basic");
                    emp.DeptNo = dr.GetInt32("DeptNo");
                    empList.Add(emp);
                }
                return empList;
            }
            catch (Exception ex)
            {
                throw;
            }
            finally
            {
                conn.Close();
            }
        }
        public static Employee getSingleEmployee(int id)
        {
            try
            {
                conn.Open();
                SqlCommand cmd = conn.CreateCommand();
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "GetSingleEmployee";
                cmd.Parameters.AddWithValue("@EmpId", id);
                SqlDataReader dr = cmd.ExecuteReader();
                Employee emp = new Employee();
                while (dr.Read())
                {
                    emp.EmpId = dr.GetInt32("EmpId");
                    emp.Name = dr.GetString("Name"); ;
                    emp.Basic = dr.GetDecimal("Basic");
                    emp.DeptNo = dr.GetInt32("DeptNo");
                }
                return emp;
            }
            catch (Exception ex)
            {
                throw;
            }
            finally
            {
                conn.Close();
            }
        }
        public static void CreateEmployee(Employee employee)
        {
            try
            {
                conn.Open();
                SqlCommand cmd = conn.CreateCommand();
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "InsertEmployee";
                cmd.Parameters.AddWithValue("@EmpId", employee.EmpId);
                cmd.Parameters.AddWithValue("@Name", employee.Name);
                cmd.Parameters.AddWithValue("@Basic", employee.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", employee.DeptNo);
                cmd.ExecuteNonQuery();
                return ;
            }
            catch (Exception ex)
            {
                throw;
            }
            finally
            {
                conn.Close();
            }
        }
        public static void DeleteEmployee(int id)
        {
            try
            {
                conn.Open();
                SqlCommand cmd = conn.CreateCommand();
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "DeleteEmployee";
                cmd.Parameters.AddWithValue("@EmpId", id);
                cmd.ExecuteNonQuery();
                return;
            }
            catch (Exception ex)
            {
                throw;
            }
            finally
            {
                conn.Close();
            }
        }
        public static void UpdateEmployee(int id, Employee employee)
        {
            try
            {
                conn.Open();
                SqlCommand cmd = conn.CreateCommand();
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.CommandText = "UpdateEmployee";
                cmd.Parameters.AddWithValue("@EmpId", employee.EmpId);
                cmd.Parameters.AddWithValue("@Name", employee.Name);
                cmd.Parameters.AddWithValue("@Basic", employee.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", employee.DeptNo);
                cmd.ExecuteNonQuery();
            }
            catch(Exception ex)
            {
                throw;
            }
            finally
            {
                conn.Close();
            }
        }
    }
}
