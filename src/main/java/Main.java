import dao.DepartmentDAO;
import entity.Department;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        DepartmentDAO departmentDAO = new DepartmentDAO();
        List<Department> departments = departmentDAO.getDepts();
        for(Department d : departments) {
            System.out.println(d.toString());
        }

    }
}
