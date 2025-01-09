﻿using System;
using Microsoft.Data.SqlClient;
using static System.Net.Mime.MediaTypeNames;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace EmployeeDatabase
{
    public class Program
    {
        static SqlConnection conn = new SqlConnection("Data Source = (localdb)\\MSSQLLocalDB; Initial Catalog = dac; Integrated Security = True;");

        static void Main(string[] args)
        {
            Connect();
            //Insert();
            //Employee emp = new Employee { EmpNo = 2, EmpName = "Anoma", Basic = 30000, DeptNo = 20 };
            //Insert2(emp);
            //emp = new Employee { EmpNo = 3, EmpName = "Hero", Basic = 3000, DeptNo = 10 };
            //InsertUsingProcedures(emp);
            //DeleteEmployeeUsingProcedures(1);

            //List<Employee> emp = GetAllEmployees();
            //foreach (var item in emp)
            //{
            //    Console.WriteLine(item.EmpNo + "->" + item.EmpName + "->"+ item.Basic + "->" + item.DeptNo);
            //}
            //Employee e = GetSingleEmployee(3);
            //Console.WriteLine(e.ToString());
            UpdateEmployeeUsingEmpId(3);
            //--
            //SelectSingleValueOnly();
            //SelectMultipleValues();
            //NextResult();
            //MARS();
            //CallFuncReturningSqlDataReader();
        }
        static public void Connect()
        {
            //SqlConnection con = new SqlConnection();
            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = dac; Integrated Security = True; Connect Timeout = 30; Encrypt = False; Trust Server Certificate = False; Application Intent = ReadWrite; Multi Subnet Failover = False
            //con.ConnectionString = "Data Source = (localdb)\\MSSQLLocalDB; Initial Catalog = dac; Integrated Security = True;";
            
            try
            {
                Program.conn.Open();
                Console.WriteLine("Connection Established");
            } catch(Exception ex) 
            {
                Console.WriteLine("connection failed");
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Program.conn.Close();
            }
            
        }

        public static void Insert()
        {
            SqlConnection conn = new SqlConnection();
            conn.ConnectionString = "Data Source = (localdb)\\MSSQLLocalDB; Initial Catalog = dac; Integrated Security = True;";
            try
            {
                conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = $"INSERT INTO employees (EmpId,EmpName,Basic,DeptNo) VALUES (1, 'saurabh', 1000, 10)";
                cmd.ExecuteNonQuery();
                Console.WriteLine("data inserted successfully");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally 
            { 
                conn.Close();
            }
        }

        public static void Insert2(Employee emp) 
        {
            try
            {
                Program.conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = Program.conn;
                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = $"INSERT INTO employees (EmpId,EmpName,Basic,DeptNo) VALUES ({emp.EmpNo}, '{emp.EmpName}', {emp.Basic}, {emp.DeptNo})";
                cmd.ExecuteNonQuery();
                Console.WriteLine("Data inserted");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Program.conn.Close();
            }
        }

        /*
        CREATE PROCEDURE [dbo].InsertEmployee
	        @EmpId int,
	        @EmpName varchar(50),
	        @Basic decimal(18,2),
	        @DeptNo int
        AS
	        INSERT INTO employees (EmpId,EmpName,Basic,DeptNo) VALUES (@EmpId, @EmpName, @Basic, @DeptNo);
        RETURN 0
         */
        public static void InsertUsingProcedures(Employee emp)
        {
            try
            {
                Program.conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = Program.conn;
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "InsertEmployee";
                cmd.Parameters.AddWithValue("@EmpId", emp.EmpNo);
                cmd.Parameters.AddWithValue("@EmpName", emp.EmpName);
                cmd.Parameters.AddWithValue("@Basic", emp.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);
                cmd.ExecuteNonQuery();
                Console.WriteLine("Data inserted");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Program.conn.Close();
            }
        }

        /*
        CREATE PROCEDURE [dbo].DeleteEmployee
            @EmpId int
        AS
            DELETE FROM Employees WHERE EmpId = @EmpId;
        RETURN 0
         */
        public static void DeleteEmployeeUsingProcedures(int empId)
        {
            try
            {
                Program.conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = Program.conn;
                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "DeleteEmployee";
                cmd.Parameters.AddWithValue("@EmpId", empId);
                cmd.ExecuteNonQuery();
                Console.WriteLine("Employee Deleted");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Program.conn.Close();
            }
        }
        //TO DO 
        static List<Employee> GetAllEmployees()
        {
            List<Employee> employeeList = new List<Employee>();

            Program.conn.Open();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection= Program.conn;
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = "SELECT * FROM Employees";
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read()) 
            {
                Employee employee = new Employee { EmpNo = (int)reader["EmpId"], EmpName = reader["EmpName"].ToString(), Basic = (decimal)reader["Basic"], DeptNo = (int)reader["DeptNo"] };
                employeeList.Add(employee);
            }
            return employeeList;
        }
        static Employee GetSingleEmployee(int EmpNo)
        {
            Employee employee = new Employee();

            try
            {
                Program.conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = Program.conn;
                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = $"SELECT * FROM Employees WHERE EmpId = {@EmpNo}";
                Console.WriteLine(cmd.CommandText);
                SqlDataReader reader = cmd.ExecuteReader();
                if(reader.Read())
                {
                    return new Employee { EmpNo = (int)reader["EmpId"], EmpName = reader["EmpName"].ToString()!, Basic = (decimal)reader["Basic"], DeptNo = (int)reader["DeptNo"] };
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                
                Program.conn.Close();
            }
            return null;
        }
        static void UpdateEmployeeUsingEmpId(int empId) 
        {
            try
            {
                Program.conn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = Program.conn;
                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = $"UPDATE Employees SET Basic = @Basic WHERE EmpId = {empId}";
                cmd.Parameters.AddWithValue("@Basic", 50000);
                cmd.ExecuteNonQuery();
                Console.WriteLine("Employee Basic Updated.");
            }
            catch(Exception ex)
            { Console.WriteLine(ex.Message); }
            finally { Program.conn.Close(); }
        }
    }



    public class Employee
    {
        public int EmpNo { get; set; }
        public string EmpName { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public override string ToString()
        {
            return $"Employee No: {EmpNo}, Name: {EmpName}, Basic Salary: {Basic}, Department No: {DeptNo}";
        }
    }
}