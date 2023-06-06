package com.example.employees.servlet;

import com.example.employees.dao.EmployeeDao;
import com.example.employees.entity.EmployeeEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {
    EmployeeDao employeeDao;

    @Override
    public void init() throws ServletException {
        employeeDao = new EmployeeDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "list":
                getList(req,resp);
                break;
            case "add":
                createUserForm(req,resp);
                break;
            default:
                getList(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        createEmpoyee(resp, req);
    }

    private void createEmpoyee(HttpServletResponse resp, HttpServletRequest req) throws IOException , ServletException{
        String fullname = req.getParameter("fullname");
        String birthday = req.getParameter("birthday");
        String address = req.getParameter("address");
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        EmployeeEntity newEmployee = new EmployeeEntity(fullname, birthday, address, position, department);
        employeeDao.insertEmployee(newEmployee);
        resp.sendRedirect("employees");
    }

    private void getList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<EmployeeEntity> listUser = employeeDao.getAllEmployee();
            req.setAttribute("listUser", listUser);
            req.getRequestDispatcher("user/listEmployee.jsp").forward(req,resp);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    private void createUserForm(HttpServletRequest req, HttpServletResponse resp){
        try {
            EmployeeEntity employees = new EmployeeEntity();
            req.setAttribute("employees", employees);
            req.setAttribute("action","add");
            req.getRequestDispatcher("employee.jsp").forward(req,resp);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
